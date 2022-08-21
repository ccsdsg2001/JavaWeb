package dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import utils.JDBCutils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author cc
 * @date 2022年08月21日 10:54
 */
public abstract class BaseDao {
    private  QueryRunner queryRunner=new QueryRunner();
    //update方法用来执行CRUD语句,返回-1 表示执行失败
    public int update(String sql,Object...args){
        Connection connection= JDBCutils.getConnection();
        try {
            queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCutils.close(connection);
        }
        return -1;
    }
    //执行一行的sql语句
    public <T> T queryForone(Class<T> type, String sql,Object...args){
        Connection connection=JDBCutils.getConnection();
        try {
            return queryRunner.query(connection, sql, new BeanHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCutils.close(connection);
        }
        return null;
    }

    //返回集合的sql语句
    public <T> List<T> queryForList(Class<T> type, String sql, Object...args){
        Connection connection=JDBCutils.getConnection();
        try {
            return (List<T>) queryRunner.query(connection, sql, new BeanHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCutils.close(connection);
        }
        return null;
    }

    //执行返回一行一列的sql语句
    public Object queryForSingle(String sql,Object...args){
        Connection connection = JDBCutils.getConnection();

        try {
            queryRunner.query(connection,sql,new ScalarHandler(),args);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCutils.close(connection);
        }
        return null;
    }

}
