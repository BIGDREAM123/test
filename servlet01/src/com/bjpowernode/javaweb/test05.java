package com.bjpowernode.javaweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

@WebServlet("/bbb")
public class test05 extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        myMythod();
    }

    public void myMythod(){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(10,20);
        int[] arr =  new int[10];
        arr[0] = 100;
        System.out.println(arr);
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
    }


}
