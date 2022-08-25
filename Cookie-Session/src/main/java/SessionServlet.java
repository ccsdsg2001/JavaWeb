import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年08月25日 20:52
 */
public class SessionServlet extends BaseServlet{

    protected void destroy(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.invalidate();

        resp.getWriter().write("siwang");
    }

    protected void life(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(3);

        resp.getWriter().write("3s后超时");
    }


    protected void defaultlife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().write("wei"+maxInactiveInterval);
    }
    protected void getattribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session域中的数据
        Object key1 = req.getSession().getAttribute("key1");
        resp.getWriter().write("da"+key1);
    }
    protected void Setattribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //保存session域中数据
        req.getSession().setAttribute("key1", "value");
        resp.getWriter().write("yijingbaocun");
    }
    protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建获取Session会话对象
        HttpSession session = req.getSession();
        //判断当前session会话，是否新创建
        boolean aNew = session.isNew();
        //获取session会话唯一标识id
        String id = session.getId();
        resp.getWriter().write(id+aNew);
    }
}
