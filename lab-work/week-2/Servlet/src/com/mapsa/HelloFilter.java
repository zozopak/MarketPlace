package com.mapsa;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebFilter(filterName = "HelloFilter",urlPatterns = "/login")
public class HelloFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String name = req.getParameter("username");
        String password=req.getParameter("password");
       if(Register.map.containsKey(name) && Register.map.get(name).equals(password)) {
           chain.doFilter(req, resp);
       }else {
           req.getRequestDispatcher("hello.html").forward(req,resp);
       }




    }

    public void init(FilterConfig config) throws ServletException {

    }

}
