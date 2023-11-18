package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
        throws ServletException, IOException {
            PrintWriter out = resp.getWriter();
            out.println("Hello, world!");
    }
}