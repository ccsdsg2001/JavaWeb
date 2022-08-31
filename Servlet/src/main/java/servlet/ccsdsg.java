package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年08月19日 22:15
 */
@WebServlet("/de")
public class ccsdsg extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext=req.getServletContext();
        servletContext.setAttribute("cc", 123);

        servletContext.getAttribute("cc");
    }
}