package com.mapsa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ResponseServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          String username=request.getParameter("username");
          String password=request.getParameter("password");

        PrintWriter out= response.getWriter();


        out.write("<!DOCTYPE html>");
        out.write("<html lang=\"en\">");
        out.write("<body>");
        out.write("welcome "+ username);
        out.write("</br>");
        for (String key : Register.map.keySet()){
            out.write(" "+ key);
        }
        out.write("</br>");
        out.write("<a href=''+ request.getRequestDispatcher().include(request,response);+''>Return</a>");
        out.write("</body>");
        out.write("</html>");
        out.close();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
