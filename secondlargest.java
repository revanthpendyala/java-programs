import java.util.Scanner;
    public class secondlargest
    {
       public static void main(String[] args)
          {
            int n, l1, l2, temp;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            n = s.nextInt();
            if(n > 1)
                {
                int a[] = new int[n];
                System.out.println("Enter all the elements:");
                for(int i = 0; i < n ; i++)
                   {
                    a[i] = s.nextInt();

                   }
                for(int i = 0; i < n; i++)
                {
                    for(int j = i + 1; j < n; j++)
                    {
                        if(a[i] < a[j])
                        {
                           temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                   }
                }

                System.out.println("SECOND LARGEST NUMBER IS :  "+a[1]);
            }
            else
            {
                System.out.println("SIZE OF THE ARRAY MUST BE LARGER THAN 1");
           }
       }
    }
