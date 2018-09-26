import java.util.Arrays;

public class ArraysClass
{
	public static void main(String [] args)
	{
		int [] numbers = new int [] {1,2,3,4,5,6,7,8,0};  // know about why its working with ,
		double n[] = new double [] {1.1,2,3,2,4,2.1,-5.5};
		Arrays.sort(n);
		for(int i=0;i<7;i++)
		System.out.println(n[i]);
		//Arrays.sort(n,3,7);
		Arrays.parallelSort(numbers);
		char [] chars = {'q','w','e','r','t','y','u','i'};
		Arrays.sort(chars);
		Arrays.parallelSort(chars);
		//suppose s is a sorted array of char ;
		System.out.println(Arrays.binarySearch(chars,'t'));  //this prints the position of the char that is searched

		System.out.println(chars);

	}
}