import java.util.Scanner;
import java.io.File ;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;                       // for file exception handling
import java.io.IOException;
public class NewPrimesArray{
   	public static void main(String [] args){
   	     int primes[] ;
   	     int howMany;
   	     Scanner kbd = new Scanner (System.in);
   	     System.out.println(" hhow many primes?  " );
   	     howMany = kbd.nextInt();
   	     primes = new int [howMany];
   	     int number2BTested;
   	     primes[0] = 2 ;
   	     primes[1] = 3 ;
   	     primes[2] = 5 ;
   	     primes[3] = 7 ;
   	     int index = 4;
   	    outer :  for (number2BTested = 11 ; ; number2BTested ++ ) {						// defining a label here  for the loop
   	      	for (int divisor = 3; divisor*divisor < number2BTested ; divisor ++ )
   	      		if( number2BTested  % divisor == 0)
	  		     continue outer;													// calling the label here
			     primes [index] = number2BTested ;
			     index ++ ;
			     if ( index == howMany)
			     break outer;
			   }
			   try
			   {
				   File primesFile = new File (" primes");
				   FileWriter fw = new FileWriter (primesFile);
				   PrintWriter pw = new PrintWriter (fw);
				// PrintWriter pw = new PrintWriter ( new FileWriter ( new File( "primes")));
				 		for ( int i = 0 ; i< primes.length ; i++)
				 		pw.println( primes [i]);
				 		pw.close ();

			   }
			    catch(FileNotFoundException  fnfe)
			   			   {
			   				   System.out.println(fnfe.getMessage ());
			   }
			   catch (IOException ioe)
			   {
				ioe.printStackTrace () ;            // as ioexception is a parent class as it can hold exception of its child class fnfe (filenotfoundexception)
				}

				for( int i = 0 ;i < primes.length ; i++ )
				 System.out.println(primes[i]);




   	}

}