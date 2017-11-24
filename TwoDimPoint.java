public class TwoDimPoint extends Object
      {
          private double x, y;
          public TwoDimPoint ()
                     {
                        x = 0.0;
                        y = 0.0;
                     }
          public TwoDimPoint (double x1)
                     {
                        x = y = x1;
                     }
          public TwoDimPoint (double x1, double y1)
                     {
                        x = x1;
                        y = y1;
                     }
          public TwoDimPoint (TwoDimPoint other)
                     {
						 this.x = other.x;
						 this.y = other.y;
					 }
          public double getX ()
                {
					return x;
				}
		  public double getY ()
			    {
				    return y;
	            }
	      public void setX (double x)
	            {
					this.x = x;
				}
	      public void setY (double y)
	            {
					this.y = y;
				}
          @Override public String toString ()
                {
                   return this.getClass ().getName () + "(" + x + ", " + y + ")";
                }
          @Override public boolean equals (Object other)
                {
				   if (this == other)
				     return true;
                   if (other == null)
                     return false;
                   if (this.getClass () != other.getClass ())
                     return false;
                   TwoDimPoint temp = (TwoDimPoint) other;
                   double tolerance = 1.0E-17;
                   if (Math.abs (temp.x - this.x) > tolerance || Math.abs (temp.y - this.y) > tolerance)
                     return false;
                   return true;
                }
        public double getDistance ()
              {
				  return Math.sqrt (this.x * this.x + this.y * this.y);
			  }
        public double getDistance (TwoDimPoint a)
              {
				  return Math.sqrt ((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
			  }
        public double getDistance (TwoDimPoint a, TwoDimPoint b)
              {
				  return Math.sqrt ((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y));
			  }
        public TwoDimPoint getMidPoint (TwoDimPoint a, TwoDimPoint b)
              {
				  return new TwoDimPoint ((a.x + b.x) / 2, (a.y + b.y) / 2);
			  }
        public static void main (String [] args)
              {
				  TwoDimPoint a = new TwoDimPoint (3, 4);
				  TwoDimPoint b = new TwoDimPoint (5, 6);
				  TwoDimPoint c = a.getMidPoint (a, b);
				  TwoDimPoint d = a.getMidPoint (b, a);
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