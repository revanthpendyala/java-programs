import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class index extends HttpServlet {
	 public void dopost(HttpServeletRequest req,HttpServletResponse res)
	   throws ServletException, IOException {
	  res.setContentType("text/html;charset=UTF-8");
	  PrintWriter out = response.getWriter();
	  try{
		  String user = req.getParameter("user");
		  out.println("<h2> Welcome "+user+" </h2>");

		  } finally{

			   out.close();
			  }

		   }
}