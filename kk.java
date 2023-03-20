abstract class Shape
{
	abstract void RectangleArea(int length,int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(int radius);
}
class Area extends Shape
{
	public void Rectangle(int length,int breadth)
	{
		int c=length*breadth;
		System.out.println(c);
	}
	public void SquareArea(int side)
	{
		int c=side*side;
		System.out.println(c);
	}
	public void CircleArea(int radius)
	{
		int c=4*radius;
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		Area x=new Area();
		x.Rectangle(4,5);
		x.SquareArea(20);
		x.CircleArea(10);
	}
}
	