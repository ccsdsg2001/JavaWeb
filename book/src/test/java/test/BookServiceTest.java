package test;

import org.junit.Test;
import pojo.Book;
import service.impl.BookService;
import service.impl.BookServiceImpl;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookServiceTest {

    private BookService bookService=new BookServiceImpl();
    @Test
    public void addBook() {
        bookService.addBook(new Book(null,"cc", "1125", new BigDecimal(1000000), 100000000, 0, null));
    }

    @Test
    public void deleteBookById() {
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(22,"ccsdsg", "1125", new BigDecimal(999999), 10, 111110, null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById(22));
    }

    @Test
    public void queryBooks() {
    }
}