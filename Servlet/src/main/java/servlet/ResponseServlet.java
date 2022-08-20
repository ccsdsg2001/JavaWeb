package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author cc
 * @date 2022年08月20日 20:35
 */
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter();
        //设置服务器字符集
        resp.setCharacterEncoding("utf-8");
        //通过响应头,设置浏览器使用UTF-8字符集
        resp.setHeader("Content-Type", "text/html;charset=UTF-8");
//        resp.getOutputStream();
        //往客户端回传数据
        PrintWriter writer = resp.getWriter();
        writer.write("rse");
        //请求重定向
        resp.setStatus(302);
        resp.setHeader("Location", "localhost:8080");
        resp.sendRedirect("http://www.baidu.com");
    }
}
