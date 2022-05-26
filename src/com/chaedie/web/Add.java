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
        String a_ = req.getParameter("a");
        String b_ = req.getParameter("b");

        int a = 0;
        int b = 0;

        if (!a_.equals("")) {
            a = Integer.parseInt(a_);
        }
        if (!b_.equals("")) {
            b = Integer.parseInt(b_);
        }

        int result = a + b;

        out.printf("결과 값 : %d\n", result);
    }
}
