package ilstu.edu;

public class GitDemo
{
	public double areaSquare(double s)
	{
		return s*s;
	}
	
	public double areaRectange(double w, double h)
	{
		return w*h;
	}
	
	public double areaTriangle(double b, double h)
	{
		return .5*b*h;
	}
	
	public double areaCircle(double r)
	{
		return r*r*Math.PI;
	}
	
	public double volumeSquare(double s)
	{
		return s*s*s;
	}
	
	public double volumeRectangle(double l, double w, double h)
	{
		return l*w*h;
	}
	
	public double volumeCircle(double r)
	{
		return (4/3)*r*r*r*Math.PI;
	}
	
	public double areaRhombus(double p, double q)
	{
		return p*q/2;
	}
	
	public double volumeCylinder(double r, double h)
	{
		return r*r*h*Math.PI;
	}
}
