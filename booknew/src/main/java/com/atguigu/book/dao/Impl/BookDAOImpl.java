package com.atguigu.book.dao.Impl;

import com.atguigu.book.dao.BookDAO;
import com.atguigu.book.pojo.Book;
import myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月10日 15:40
 */
public class BookDAOImpl extends BaseDAO<Book> implements BookDAO {
    @Override
    public List<Book> getBookList() {
        return executeQuery("select * from t_book");
    }
}
