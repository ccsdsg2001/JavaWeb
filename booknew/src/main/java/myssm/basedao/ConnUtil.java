package myssm.basedao;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnUtil {

    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
    //private static ThreadLocal<Object> threadLocal2 = new ThreadLocal<>();
    //private static ThreadLocal<Object> threadLocal3 = new ThreadLocal<>();

//    public static  String DRIVER;
//    public static  String URL;
//    public static  String USER;
//    public static  String PWD;

    static  Properties properties=new Properties();
    static {
        InputStream is = ConnUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");

        try {
            properties.load(is);
//            DRIVER = properties.getProperty("jdbc.driver");
//            URL =properties.getProperty("jdbc.url");
//            USER =properties.getProperty("jdbc.user");
//            PWD=properties.getProperty("jdbc.pwd");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Connection createConn(){
            try {
                DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);


                return dataSource.getConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
//            DruidDataSource druidDataSource = new DruidDataSource();
//            druidDataSource.setDriverClassName(DRIVER);
//            druidDataSource.setUrl(URL);
//            druidDataSource.setUsername(USER);
//            druidDataSource.setPassword(PWD);
//
//            druidDataSource.setMaxActive(10);
//            druidDataSource.setMaxWait(5000);
//            druidDataSource.setMaxIdle(3);


            
            //1.加载驱动
           // /Class.forName(DRIVER);
            //2.通过驱动管理器获取连接对象
//            return DriverManager.getConnection(URL, USER, PWD);


        return null ;
    }

    public static Connection getConn(){
        Connection conn = threadLocal.get();
        if(conn==null){
            conn =createConn();
            threadLocal.set(conn);
        }
        return threadLocal.get() ;
    }

    public static void closeConn() throws SQLException {
        Connection conn = threadLocal.get();
        if(conn==null){
            return ;
        }
        if(!conn.isClosed()){
            conn.close();
            //threadLocal.set(null);
            threadLocal.remove();
        }
    }
}
