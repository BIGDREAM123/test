package com.bjpowernode.javaweb;

import com.sun.jdi.connect.spi.Connection;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.tagext.TryCatchFinally;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/aaa")
public class servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getContextPath();
        String uri = req.getRequestURI();
        String   servletPath      = req.getServletPath();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("contextpath = " + contextPath +"<br>");
        out.println("uri = " + uri +"<br>");
        out.println("servletpath = " + servletPath +"<br>");





    }
}
