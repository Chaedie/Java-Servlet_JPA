package com.chaedie.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Nana extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Hello ~ ");
    }
}
