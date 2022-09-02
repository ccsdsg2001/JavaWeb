package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年08月19日 22:15
 */

@WebServlet(urlPatterns = {"/demo01"},initParams = {
        @WebInitParam(name = "help",value = "weo"),
        @WebInitParam(name = "help",value = "weo")
})
public class ccsdsg extends HttpServlet {


    @Override
    public void init() throws ServletException {
        ServletConfig servletConfig = getServletConfig();
        String h = servletConfig.getInitParameter("h");
        System.out.println(h);
        ServletContext servletContext = getServletContext();
        String context = servletContext.getInitParameter("context");
        System.out.println(context);

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext=req.getServletContext();
        servletContext.setAttribute("cc", 123);

        servletContext.getAttribute("cc");
    }
}