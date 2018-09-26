import java.util.Scanner;
class ex3{
public static void main(String args[]){
Scanner input = new Scanner (System.in);
System.out.println(" enter the a value");
int h,m,s,a;
 a =input.nextInt();
h=a/3600;
a=a%3600;
System.out.println(" hours:" +h);
m=a/60;
System.out.println("minutes:" +m);
s=a%60;
System.out.println("seconds:" +s);
System.out.println("time is  :" +h+":"+m+":"+s);
}
}