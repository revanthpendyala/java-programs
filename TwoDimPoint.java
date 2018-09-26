public class TwoDimPoint

{

private double x,y;

public TwoDimPoint()
{}

public TwoDimPoint(double x)

{
	this.x=x; y=x;
	}

public TwoDimPoint(double x,double y)

{
	this.x=x; this.y=y;
	}

public TwoDimPoint(TwoDimPoint other)

{
	x=other.x; y=other.y;
	}

public void moveTo(TwoDimPoint there)

{
	x=there.x; y=there.y;
	}

public double getDistance(TwoDimPoint other)

{
		return Math.sqrt(Math.pow((x-other.x),2)+Math.pow((y-other.y),2));
	}

public double getDistance(TwoDimPoint a,TwoDimPoint b)

{
		return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
	}

public String display()

{
		return "(" +x+","+y+")";
	}

public String toString()

{
		return "(" +x+","+y+")";
	}

public static void main(String[] args)

{
		TwoDimPoint a= new TwoDimPoint(3.4,5.6);

TwoDimPoint b= new TwoDimPoint(4.8);

TwoDimPoint c= new TwoDimPoint();

double distanceBC = a.getDistance( b,c);

System.out.println(a.display());

System.out.println(b.display());

System.out.println(c.display());

System.out.println(new TwoDimPoint(4.7,-7.9));

System.out.println(distanceBC);

System.out.println(a);
	}
}
