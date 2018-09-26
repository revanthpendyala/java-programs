import java.util.Scanner;
public class Decimalpoint
{
   	public static void main(String [] args)
   	{   double num;
        Scanner kbd = new Scanner(System.in);
        System.out.println ("enter the number  :");
   	    num = kbd.nextDouble();
        System.out.println(num);
         String s = new Double(num).toString();
        System.out.println(s);



   	}
}