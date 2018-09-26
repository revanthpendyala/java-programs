import java.util.Scanner;
class ex4{
public static void main(String args[]){

Scanner input= new Scanner(System.in);
double pamt,roi,n,ci;
System.out.println(" enter the values of pamt,roi,n:");
pamt=input.nextDouble();
roi=input.nextDouble();
n=input.nextDouble();
ci=pamt*Math.pow((1+roi/100),n);
ci-=pamt;
System.out.println(" the ci is :" +ci);
}
}