import java.util.Scanner;
public class array2
{
  public static void main(String [] args)
    {
      int n,N,F;
      int i = 0,j = 0,k =0;
       Scanner s = new Scanner(System.in);
       System.out.println(" enter how values u need in array 1: ");
       n = s.nextInt();
       System.out.println("enter how elements u need  in array 2:  ");
       N = s.nextInt();
      int a[] = new int [n];
      System.out.println("enter all elements in array 1:");
      for(i =o ; i < n ; i++)
      {
		 a[i] = s.nextInt();
      }
      int b[] = new int[N];
      for (j = 0 ; j < N ;j++)
      {
          b[j] = s.nextInt() ;

      }
      F = n+N;
      int c[] = new int[F];

       for(i=0;i<n;i++)
	    {
	    for(j=0;j<N;j++)
	    {
	      for (k = 0; k < F ; k++)
	    {
	    if(k%2==0)
	    {
	    c[k]=a[i];
	    i++;
	    }
	    else
	    {
	    c[k]=b[j];
	    j++;
	    }
	    }
	    }
	    }
	      System.out.println("THE ANSWER IS");
	    for(k=0;k<F;k++)

	    System.out.println(c[k]);
	    }
  }

    }
}