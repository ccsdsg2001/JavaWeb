package service.impl;

import dao.impl.BookDao;
import dao.impl.BookDaoImpl;
import pojo.Book;

import java.util.List;

/**
 * @author cc
 * @date 2022年08月24日 16:54
 */
public class BookServiceImpl implements  BookService{
    private BookDao bookDao=new BookDaoImpl();
    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookDao.deleteTeBookById(id);

    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public List<Book> queryBooks() {
        return bookDao.queryBooks();
    }
}
