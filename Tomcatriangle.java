import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Tomcatriangle extends HttpsServlet
    {
		public void doGet (HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException
		{
            response.setContentType ("text/html");
            PrintWriter out = response.getWriter();
			double AB = Double.parseDouble (request.getParameter ("AB"));
			double BC = Double.parseDouble (request.getParameter ("BC"));
			double CA = Double.parseDouble (request.getParameter ("CA"));
            String string = isTriangle (AB,BC,CA) ? "AREA = "+
		 }
      public boolean isTriangle (double a,double b,double c)
      {
          return a+b >c && b+c >a && c+a > b ;
       }
           public double getArea (double a,double b,double c)
           {
             double s = getPerimeter (a,b,c)/2;
             return Math.sqrt (s(s-a)*(s-b)*(s-c));
            }
            public double getPerimeter (double a, double b, double c)
            {
              return (a+b+c);
            }


      }













