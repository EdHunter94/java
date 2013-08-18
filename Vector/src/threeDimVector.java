public class threeDimVector extends twoDimVector
{
	double z;
	
	public threeDimVector(double x, double y, double z)
	{
		super(x, y);
		
		this.z = z;
	}
	
	public String toString()
	{
		return "<" + this.x + ", " + this.y + ", " + this.z + ">";
	}
	
	public threeDimVector add(threeDimVector two)
	{
		x = this.x + two.x;
		y = this.y + two.y;
		z = this.z + two.z;
		
		return new threeDimVector(x, y, z);
	}
	
	public threeDimVector subtract(threeDimVector two)
	{
		x = this.x - two.x;
		y = this.y - two.y;
		z = this.z - two.z;
		
		return new threeDimVector(x, y, z);
	}
	
	public threeDimVector multiplyByConstant(double constant)
	{
		x = this.x * constant;
		y = this.y * constant;
		z = this.z * constant;
		
		return new threeDimVector(x, y, z);
	}
	
	public double dotProduct(threeDimVector two)
	{
		 return (this.x * two.x) + (this.y * two.y) + (this.z * two.z);
	}
	
	public double getxValue()
	{
		return super.getxValue();
	}
	
	public double getyValue()
	{
		return super.getyValue();
	}
	
	public double getzValue()
	{
		return this.z;
	}
	
	public boolean equals(threeDimVector two)
	{
		return this.x == two.x && this.y == two.y && this.z == two.z;
	}
	
	public threeDimVector crossProduct(threeDimVector two)
	{		
		return new threeDimVector((this.y * two.z) - (this.z * two.y), (this.z * two.x) - (this.x * two.z), (this.x * two.y) - (this.y * two.x));
	}
	
	public static void main(String args[])
	{
		threeDimVector vector = new threeDimVector(1, 2, 3);
		threeDimVector vector2 = new threeDimVector(4, 5, 6);
		
		System.out.println(vector.toString());
		System.out.println(vector2.toString());
		System.out.println(vector.getxValue());
		System.out.println(vector2.getzValue());
	}
	
	
}