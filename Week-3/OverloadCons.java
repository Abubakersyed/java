class Box 
{
	double width,height,depth;
	Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	Box()
	{
		width=height=depth=-1;
	}
	Box(double len)
	{
		width=height=depth=len;
	}
	double volume()
	{
		return width*depth*height;
	}
}
class OverloadCons
{
	public static void main(String args[])
	{
		Box mybox1=new Box(7,8,9);
		Box mybox2=new Box();
		Box mycube=new Box(5);
		 double vol1=mybox1.volume();
		double vol2=mybox2.volume();
		double vol3=mycube.volume();
		System.out.println("PARAMETERIZED CONSTRUCTOR WITH 3 PARAMETERS:"+vol1);
		System.out.println("DEFAULT CONSTRUCTOR:"+vol2);
		System.out.println("PARAMETERIZED CONSTRUCTOR WITH 1 PARAMETER:"+vol3);
	}
}