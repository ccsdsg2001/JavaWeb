package dao.impl;

import pojo.Book;

import java.util.List;

public interface BookDao {
    public int addBook(Book book);

    public int deleteTeBookById(Integer id);

    public int updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

    Integer queryForPageTotalCount();

    List<Book> queryForPageItems(int begin, int pageSize);
}
