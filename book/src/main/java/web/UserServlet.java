package web;

import org.apache.commons.beanutils.BeanUtils;
import pojo.User;
import service.impl.UserService;
import service.impl.UserServiceImpl;
import test.UserServletTest;
import utils.webUtils;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserServlet extends BaseServlet {


    private UserService userService = new UserServiceImpl();




    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        User user=webUtils.copyParamToBean(req.getParameterMap(),new User());

//        2、检查 验证码是否正确  === 写死,要求验证码为:abcde
        if ("abcde".equalsIgnoreCase(code)) {
//        3、检查 用户名是否可用
            if (userService.existUsername(username)) {
                System.out.println("用户名[" + username + "]已存在!");

                req.setAttribute("msg", "用户名已存在!");
                req.setAttribute("username", username);
                req.setAttribute("email", email);
//        跳回注册页面
                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
            } else {
                //      可用
//                调用Sservice保存到数据库
                userService.registUser(new User(null, username, password, email));
//
//        跳到注册成功页面 regist_success.jsp
                req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req, resp);
            }
        } else {
            req.setAttribute("msg", "验证码错误");
            req.setAttribute("username", username);
            req.setAttribute("email", email);

            System.out.println("验证码[" + code + "]错误");
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
        }
    }

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if ("login".equals(action)) {
            //  1、获取请求的参数
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            // 调用 userService.login()登录处理业务
            User loginUser = userService.login(new User(null, username, password, null));
            // 如果等于null,说明登录 失败!
            if (loginUser == null) {
                req.setAttribute("msg", "用户或密码错误！");
                req.setAttribute("username", username);
                //   跳回登录页面
                req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
            } else {
                // 登录 成功
                //跳到成功页面login_success.html
                req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req, resp);

            }
        }

    }
}
