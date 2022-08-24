package test;

import dao.impl.BookDao;
import dao.impl.BookDaoImpl;
import org.junit.Test;
import pojo.Book;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookDaoTest {

    private BookDao bookDao=new BookDaoImpl();
    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"ccsdsg","123123",new BigDecimal(1000),10000,0,null));
    }

    @Test
    public void deleteTeBookById() {
        bookDao.deleteTeBookById(21);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(21,"cc","123123",new BigDecimal(1000),10000,0,null));

    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(21));
    }

    @Test
    public void queryBooks() {
    }
}