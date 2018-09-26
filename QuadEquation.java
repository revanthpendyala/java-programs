import java.util.Scanner;
public class QuadEquation
{
   public static void main (String [] args )
   {
      int a , b,  c;
      double root1,root2,d;
      Scanner s = new Scanner (System.in);
      System.out.println(" the given quadratic equation is: ax^2+by+c");
      System.out.println("ener the value of a:");
      a = s.nextInt();
      System.out.println("enter the value of b:");
      b = s.nextInt();
      System.out.println(" enter the value of c: ");
      c = s.nextInt();
      System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
      d = b*b - 4*a*c;
      if(d > 0)
      {
		  System.out.println("the roots are distinct !");
		  root1 = (-b + Math.sqrt(d)/(2*a) );
		  root2 = (-b - Math.sqrt(d)/(2*a));
          System.out.println("the roots are " +root1);
           System.out.println("the roots are " +root2);

      }
      else if(d == 0)
      {
		 System.out.println("the roots are real!");
		 root1 = (-b + Math.sqrt(d)/(2*a));
		 System.out.println("the roots are :" +root1);

      }
      else
      {
      System.out.println(" the roots are imaginary !");
   }



   }



}