import java.util.Scanner;
class ex5{
public static void main(String args[]){
Scanner input =new Scanner(System.in);
int eid;
String ena,job;
double bsal,gsal,nsal,hra,ta,pt,pf,et;
System.out.println(" enter the eid,name,job,bsal:");
eid=input.nextInt();
ena=input.next();
job=input.next();
bsal=input.nextDouble();
hra=bsal*40/100;
ta=bsal*0.1;
pt=bsal*0.15;
et=bsal*0.04;
pf=bsal*0.12;
gsal=bsal+hra+ta+et;
nsal=bsal-pt-pf;
System.out.println("gross pay:" +gsal);
System.out.println("net pay:"+nsal);
}
}