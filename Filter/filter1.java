import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年09月03日 11:37
 */
@WebFilter("/a")
public class filter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("a");
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("A");
    }

    @Override
    public void destroy() {

    }
}
