class student
{
	public int roll_no;
	public String name;
	student(int rool_no,String name)
	{
		this.roll_no = roll_no;
		this.name = name;
		}

}

public class cfg
{
	public static void main (String[] args)
	{
      student [] arr;
      arr = new student[5];
      arr[0] = new student(1,"aman");
      arr[1] = new student(2,"raj");
      arr[2] = new student(3,"shikae");
       arr[3] = new student(4,"revanth");
       arr[4] = new student(5,"rahul");
       for (int i = 0; i < arr.length; i++)
	               System.out.println("Element at " + i + " : " +
                        arr[i].roll_no +" "+ arr[i].name);

		}

}