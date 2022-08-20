package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年08月20日 16:18
 */
public class RequestApitest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getRemoteHost());
        System.out.println(req.getHeader("User-Agent"));
        System.out.println(req.getMethod());
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决post中文乱码问题
        req.setCharacterEncoding("UTF-8");
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getRemoteHost());
        System.out.println(req.getHeader("User-Agent"));
        System.out.println(req.getMethod());
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/test");
        requestDispatcher.forward(req,resp);
    }
}
