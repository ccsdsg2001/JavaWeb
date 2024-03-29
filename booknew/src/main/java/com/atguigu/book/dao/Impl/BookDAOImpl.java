package com.atguigu.book.dao.Impl;

import com.atguigu.book.dao.BookDAO;
import com.atguigu.book.pojo.Book;
import myssm.basedao.BaseDAO;


import java.util.List;

public class BookDAOImpl extends BaseDAO<Book> implements BookDAO {
    @Override
    public List<Book> getBookList() {
        return executeQuery("select * from t_book where bookStatus=0");
    }

    @Override
    public Book getBook(Integer id) {
        return load("select * from t_book where id = ? " , id);
    }
}
