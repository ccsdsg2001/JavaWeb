import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年08月30日 11:45
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String fname = req.getParameter("fname");
        String price = req.getParameter("price");
        Integer i = Integer.parseInt(price);
        String fcount = req.getParameter("fcount");
        String remark = req.getParameter("remark");



    }
}
