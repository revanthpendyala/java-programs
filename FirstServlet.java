import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet
      {
        @Override
        public void doGet (HttpServletRequest request,
             HttpServletResponse response)
             throws IOException, ServletException
         {
         response.setContentType ("text/html");
         PrintWriter out = response.getWriter ();
         out.println ("<!DOCTYPE html><html><head><title>First Servlet</title></head><body><h1>My First Servlet</h1></body></html>");
         }
      }