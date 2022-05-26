package com.chaedie.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Calc extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String a_ = req.getParameter("a");
        String b_ = req.getParameter("b");
        String op = req.getParameter("operator");

        int a = 0;
        int b = 0;

        if (!a_.equals("") && !(a_ == null)) {
            a = Integer.parseInt(a_);
        }
        if (!b_.equals("") && !(b_ == null)) {
            b = Integer.parseInt(b_);
        }
        int result = 0;
        if (op.equals("덧셈")) {
            result = a + b;
        }
        if (op.equals("뺄셈")) {
            result = a - b;
        }

        out.printf("결과 값 : %d\n", result);
    }
}
