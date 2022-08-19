package servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年08月19日 14:39
 */
public class test implements Servlet {
    public test(){
        System.out.println("构造器");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    /**service方法专门用来请求和访问
     * @Author cc
     * @Description //TODO
     * @Date 14:40 2022/8/19
     * @param servletRequest
     * @param servletResponse
     **/

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
