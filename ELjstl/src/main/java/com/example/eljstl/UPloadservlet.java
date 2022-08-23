package com.example.eljstl;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * @author cc
 * @date 2022年08月23日 20:47
 */
public class UPloadservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("文件上传") ;
//        ServletInputStream inputStream = req.getInputStream();
//        byte[] buffer=new byte[102400];
//        int read =inputStream.read(buffer);
//        System.out.println(new String(buffer,0,read));
//
//        ServletFileUpload.isMultipartContent(req);

        if(ServletFileUpload.isMultipartContent(req)){
            //创建FileItemFactory工厂实现类
            FileItemFactory factory =new DiskFileItemFactory();
            //创建用于解析上传数据的工具类ServletFileUpload类
            ServletFileUpload servletFileUpload = new ServletFileUpload(factory);
            //解析上传的数据,得到一个表单项FileItem
            try {
                List<FileItem> list = servletFileUpload.parseRequest(req);
                //循环判断每一个表单项是普通类型还是上传文件
                for(FileItem fileItem:list){
                    if (fileItem.isFormField()){
                        System.out.println(fileItem.getFieldName());
                        System.out.println(fileItem.getString("UTF-8"));
                    }else {
                        System.out.println(fileItem.getFieldName());
                        System.out.println(fileItem.getName());


                        try {
                            fileItem.write(new File("e:\\"+fileItem.getName()));
                        } catch (Exception e) {

                            e.printStackTrace();
                        }
                    }
                }


            } catch (FileUploadException e) {
                e.printStackTrace();

            }
        }

    }
}
