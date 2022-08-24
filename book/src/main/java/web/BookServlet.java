package web;

import pojo.Book;
import service.impl.BookService;
import service.impl.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class BookServlet extends BaseServlet {
    private BookService bookService=new BookServiceImpl();

    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1。通过bookservice查询全部图书 2.全部图书保存到request域中 3.请求转发到pages/manager/book_manager.jsp
        List<Book> books = bookService.queryBooks();
        request.setAttribute("books", books);
        request.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(request,response);
    }



}
