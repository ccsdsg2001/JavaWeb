package com.example.eljstl;

import org.apache.commons.io.IOUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

public class  download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String downloadfilename= "4.jpg";
        ServletContext servletContext=getServletContext();
        String mimeType = servletContext.getMimeType("/file/"+downloadfilename);
        response.setContentType(mimeType);

        response.setHeader("Content-Disposition", "attachment;filename"+downloadfilename);



        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + URLEncoder.encode("zhpogn.jpg", "UTF-8"));

//        byte[] buffer = new byte[1024];
//        resourceAsStream.read(, , );
        OutputStream outputStream=response.getOutputStream();
        IOUtils.copy(resourceAsStream,outputStream);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
