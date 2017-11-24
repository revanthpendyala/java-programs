public class ThreeDimPoint extends TwoDimPoint
      {
          private double z;
          public ThreeDimPoint ()
                     {
                        z = 0.0;
                     }
          public ThreeDimPoint (double x1)
                     {
                        super (x1);
                        z = x1;
                     }
          public ThreeDimPoint (double x1, double y1)
                     {
                        super (x1, y1);
                        z = (x1 + y1) / 2;
                     }
          public ThreeDimPoint (double x1, double y1, double z1)
                     {
                        super (x1, y1);
                        z = z1;
                     }

          public ThreeDimPoint (ThreeDimPoint other)
                     {
						 super.setX (other.getX ());
						 super.setY (other.getY ());
						 this.setZ (other.getZ ());
					 }
          public double getX ()
                {
					return super.getX ();
				}
		  public double getY ()
			    {
				    return super.getY ();
	            }
	      public double getZ ()
	            {
					return z;
				}
	      public void setX (double x)
	            {
					super.setX (x);
				}
	      public void setY (double y)
	            {
					super.setY (y);
				}
	      public void setZ (double z)
	            {
					this.z = z;
				}
          @Override public String toString ()
                {
                   return this.getClass ().getName () + "(" + super.getX () + ", " + super.getY () + ", " + z + ")";
                }
          @Override public boolean equals (Object other)
                {
				   if (this == other)
				     return true;
                   if (other == null)
                     return false;
                   if (this.getClass () != other.getClass ())
                     return false;
                   ThreeDimPoint temp = (ThreeDimPoint) other;
                   TwoDimPoint one = new TwoDimPoint (this.getX (), this.getY ());
                   TwoDimPoint two = new TwoDimPoint (temp.getX (), temp.getY ());
                   double tolerance = 1.0E-17;
                   if ((Math.abs (temp.z - this.z) > tolerance) || ! (one.equals (two)))
                     return false;
                   return true;
                }
        public double getDistance ()
              {
				  TwoDimPoint xy = new TwoDimPoint (super.getX (), super.getY ());
				  double xyDistance = xy.getDistance ();
				  return Math.sqrt (xyDistance * xyDistance + this.z * this.z);
			  }
        public double getDistance (ThreeDimPoint a)
              {
				  return Math.sqrt ((this.getX () - a.getX ()) * (this.getX () - a.getX ()) + (this.getY () - a.getY ()) * (this.getY () - a.getY ()) + (this.z - a.z) * (this.z - a.z));
			  }
        public double getDistance (ThreeDimPoint a, ThreeDimPoint b)
              {
				  return Math.sqrt ((b.getX () - a.getX ()) * (b.getX () - a.getX ()) + (b.getY () - a.getY ()) * (b.getY () - a.getY ()) + (b.z - a.z) * (b.z - a.z));
			  }
        public ThreeDimPoint getMidPoint (ThreeDimPoint a, ThreeDimPoint b)
              {
				  return new ThreeDimPoint ((a.getX () + b.getX ()) / 2, (a.getY () + b.getY ()) / 2, (a.z + b.z) / 2);
			  }
        public static void main (String [] args)
              {
				  ThreeDimPoint a = new ThreeDimPoint (3, 4, 5);
				  ThreeDimPoint b = new ThreeDimPoint (5, 6, 7);
				  ThreeDimPoint c = a.getMidPoint (a, b);
				  ThreeDimPoint d = a.getMidPoint (b, a);
				  System.out.println (a);
				  System.out.println (b);
				  System.out.println (c);
				  System.out.println (d);
				  System.out.println (c == d);
				  System.out.println (c.equals (d));
				  System.out.println (a.getDistance ());
				  System.out.println (a.getDistance (c));
				  System.out.println (a.getDistance (b, d));
			  }
      }