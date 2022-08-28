package com.example.json;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年08月28日 20:48
 */
public class AJAXServlet extends BaseServlet{
    protected void ajax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("guo");

        bean bean = new bean("cc",1);
        Gson gson = new Gson();
        String s = gson.toJson(bean);
        resp.getWriter().write(s);

    }
}
