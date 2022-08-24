package web;

import pojo.Book;
import service.impl.BookService;
import service.impl.BookServiceImpl;
import utils.webUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class BookServlet extends BaseServlet {
    private BookService bookService=new BookServiceImpl();

    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      1.获取请求的参数 封装成book对象
        Book book = webUtils.copyParamToBean(request.getParameterMap(), new Book());
        //2.调用BookService.addBook()保存图书
        bookService.addBook(book);
        //3.跳转到图书列表页面
//        request.getRequestDispatcher()

        response.sendRedirect(request.getContextPath()+"/manager/bookServlet?action=list");
    }


    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取请求的参数id
        int id =webUtils.parseInt(request.getParameter("id"), 0);
//2.调用bookservice.deleteBookByid():删除图书
        bookService.deleteBookById(id);
        //3.重定向回图书列表管理页面
        response.sendRedirect(request.getContextPath()+"/manager/bookServlet?action=list");
    }

    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取请求的参数 封装成book对象
        Book book=webUtils.copyParamToBean(request.getParameterMap(), new Book());
        //2.调用bookService.updateBook(book);修改图书
        bookService.updateBook(book);
        //3.重定向回到页面
        response.sendRedirect(request.getContextPath()+"/manager/bookServlet?action=list");
    }
    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1。通过bookservice查询全部图书 2.全部图书保存到request域中 3.请求转发到pages/manager/book_manager.jsp
        List<Book> books = bookService.queryBooks();
        request.setAttribute("books", books);
        request.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(request,response);
    }

    protected void getBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取请求的参数图书编号
        int id=webUtils.parseInt(request.getParameter("id"), 0);
        //2.调用bookservice.queryBookBYid查询图书
        Book book=bookService.queryBookById(id);
        //3. 保存图书到request域中
        request.setAttribute("book", book);
        //4.请求转发页面
        request.getRequestDispatcher("/pages/manager/book_edit.jsp").forward(request,response);
    }

}
