import java.util.*;
public class date
{

       int day,month,year;
       String dayofweek;
       int[] daysInmonth = {31,28,31,30,31,30,31,30,31,30,31,30};

 boolean  isValiddate()
         {

           if(day > 31)
            System.out.println("entered date is invalid");
           return true;
	     }

	     public static void main(String [] args )
	     {
             Scanner s = new Scanner(System.in);
           System.out.println("enter the day :");
            date day = new date();

            date d = new date();
             d.isValiddate();

		 }
}