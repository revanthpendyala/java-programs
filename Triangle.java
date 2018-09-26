import static java.lang.Math.*;
public class Triangle
{
	private double side1,side2,side3;
	private double angle1,angle2,angle3;
	private double area,perimeter;
	public Triangle()
	{
		side1=side2=side3=10.0;
		angle1=getAngle(side2,side3,side1);
		angle2=getAngle(side3,side1,side2);
		angle3=getAngle(side1,side2,side3);
		area=getArea(side1,side2,side3);
		perimeter=getPerimeter(side1,side2,side3);
	}
	public Triangle(double side)
	{
		side1=side2=side3=side;
		angle1=getAngle(side2,side3,side1);
		angle2=getAngle(side3,side1,side2);
		angle3=getAngle(side1,side2,side3);
		area=getArea(side1,side2,side3);
		perimeter=getPerimeter(side1,side2,side3);
	}
	public Triangle(double sidea,double sideb)
	{
		side1=sidea;
		side2=sideb;
		side3=sidea > sideb ? sidea : sideb;
		angle1=getAngle(side2,side3,side1);
		angle2=getAngle(side3,side1,side2);
		angle3=getAngle(side1,side2,side3);
		area=getArea(side1,side2,side3);
		perimeter=getPerimeter(side1,side2,side3);
	}
	public Triangle(double sidea,double sideb,double sidec)
	{
		this();
		if(isTriangle(sidea,sideb,sidec))
		{
		side1=sidea;
		side2=sideb;
		side3=sidec;
		angle1=getAngle(side2,side3,side1);
		angle2=getAngle(side3,side1,side2);
		angle3=getAngle(side1,side2,side3);
		area=getArea(side1,side2,side3);
		perimeter=getPerimeter(side1,side2,side3);
		}

	}
	public Triangle(TwoDimPoint a,TwoDimPoint b,TwoDimPoint c)
	{
		side1=a.getDistance(b,c);
		side2=b.getDistance(c,a);
		side3=c.getDistance(a,b);
		angle1=getAngle(side2,side3,side1);
		angle2=getAngle(side3,side1,side2);
		angle3=getAngle(side1,side2,side3);
		area=getArea(side1,side2,side3);
		perimeter=getPerimeter(side1,side2,side3);

	}
	boolean isTriangle(double a,double b,double c)
	{
		return (a+b>c && b+c>a && c+a>b);
	}
	double getAngle(double a,double b,double c)
	{
		return Math.toDegrees(Math.acos((a*a + b*b - c*c)/(2*a*b)));
	}
	double getArea(double a,double b,double c)
	{
		double s = getPerimeter(a,b,c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	double getPerimeter(double a,double b,double c)
	{
		return (a+b+c);
	}
	public String toString()
	{
		return "side1 are: " +side1+ " , "+side2+", "+side3 +
		",\nangles are: " +angle1+ " , "+angle2+", "+angle3 +
		",\narea is: "+area+
		",\nperimeter is: "+perimeter;
	}

	public static void main(String[] args)
	{
		Triangle ABC = new Triangle(3,4,5);
		TwoDimPoint a1= new TwoDimPoint(3,4);
		TwoDimPoint a2= new TwoDimPoint(7,11);
		TwoDimPoint a3=new TwoDimPoint(14,22);
		Triangle DEF =new Triangle(a1,a2,a3);
		System.out.println(ABC);
		System.out.println(DEF);

	}

}










