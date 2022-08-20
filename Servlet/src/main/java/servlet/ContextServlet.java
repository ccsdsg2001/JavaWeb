package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();
        String username = servletContext.getInitParameter("username");
        System.out.println(username);
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);
        System.out.println(servletContext.getRealPath("/"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
