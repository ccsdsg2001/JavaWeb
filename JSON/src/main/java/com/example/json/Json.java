package com.example.json;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cc
 * @date 2022年08月28日 20:19
 */
public class Json {
    @Test
    public void test1(){
        bean cc = new bean("cc", 1);
        Gson gson = new Gson();
        String s = gson.toJson(cc);
        System.out.println(s);

        bean bean = gson.fromJson(s, bean.class);
        System.out.println(bean);


    }
    @Test
    public void test22(){
        Map<Integer,bean> map=new HashMap<>();

        map.put(1,new bean("cc",1));
        map.put(2,new bean("cc3",12));

        Gson gson = new Gson();
        String s = gson.toJson(map);
        System.out.println(s);


    }
    @Test
    public void test2(){
        List<bean> beans=new ArrayList<>();

        beans.add(new bean("cc",1));
        beans.add(new bean("c2c",2));

        Gson gson = new Gson();
        String s = gson.toJson(beans);
        System.out.println(s);

        bean bean = gson.fromJson(s, bean.class);
        System.out.println();
    }
}
