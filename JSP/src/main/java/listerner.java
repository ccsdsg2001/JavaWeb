import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author cc
 * @date 2022年08月22日 15:54
 */
public class listerner implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("chuangjian");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("xiaohuil");
    }
}
