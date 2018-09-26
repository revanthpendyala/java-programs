 import java.util.Scanner;
public class arrays1
{
public static void main (String [] args)
{ 
int n,N,F;
int i=0,j=0,k=0;
 Scanner s = new Scanner(System.in);
 System.out.print("Enter no. of elements you want in  First array:");
 n = s.nextInt();
 System.out.print("Enter no. of elements you want in  second array:");
 N= s.nextInt();
 int z[] = new int[n];
  System.out.println("Enter all the elements:");
  for( i = 0; i < n ; i++)
  {
     z[i] = s.nextInt(); 
   }
   int q[] = new int[N];
  System.out.println("Enter all the elements:");
  for(j = 0; j < N ; j++)
  {
     q[j] = s.nextInt(); 
   }
  F= n+N;
   int l[] = new int[F];
  for(i=0;i<n;i++)
  {
  for(j=0;j<N;j++)
  {
    for (k = 0; k < F ; k++)
  {
  if(k%2==0)
  {
  l[k]=z[i];
  i++;
  }
  else 
  {
  l[k]=q[j];
  j++;
  }
  }
  }
  }
    System.out.println("THE ANSWER IS");
  for(k=0;k<F;k++)
  
  System.out.println(l[k]);
  }
  }
    
  
   
