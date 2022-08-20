package test;

import org.junit.Test;
import utils.JDBCutils;

/**
 * @author cc
 * @date 2022年08月20日 22:56
 */
public class jdbcutilstest {
    @Test
    public void test1(){
        System.out.println(JDBCutils.getConnection());
    }
}
