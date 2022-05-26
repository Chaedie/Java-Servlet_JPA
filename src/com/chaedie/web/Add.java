package com.chaedie.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        int a_ = Integer.parseInt(req.getParameter("a"));
        int b_ = Integer.parseInt(req.getParameter("b"));
        int result = a_ + b_;

        out.println("결과 값 : " + result);
    }
}
