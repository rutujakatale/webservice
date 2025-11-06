package com.mit.services;

public class Assignment1 {

	//SET A1
	public int add(int a,int b)
	{
		//System.out.println("Value "+a+b);
		return(a+b);
	}
	
	public int sub(int a,int b)
	{
		return(a-b);
	}
	
	public int mult(int a,int b)
	{
		return(a*b);
	}
	
	public int div(int a,int b)
	{
		return(a/b);
	}
	
	// SET A2
	
	public double areaoftriangle(double base,double height)
	{
		return(0.5*base*height);
	}
	
	//SET B1
	public double surfacearea(double l,double b,double h )
	{
		return(2*(l*b+l*h+b*h)); 
	}
	
	public double volume(double l,double b,double h )
	{
		return(l*b*h); 
	}
	
	//SET B2
	public double distance(double x1,double x2,double y1,double y2)
	{
		return(Math.sqrt(Math.pow(x2-x1, 2))+Math.pow(y2-y1, 2));
	}
	
	//SET C1
	public int total(int physics,int maths,int chemistry,int biology,int  
			marathi,int english)
	{
		return(physics+ maths+ chemistry+ biology+marathi+ english);
	}
	
	public double percentage(int totalmarks)
	{
		return (totalmarks/6);
	}
	
	//SET C2
	public double areaofcircle(double r)
	{
		return (3.14*r*r);
	}
	
	public double volumeofcircle(double r,double h)
	{
		return (3.14*r*r*h);
	}
}