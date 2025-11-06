package com.mit.services;

public class Assignment3Server {
	
	//SET A1
	public String positiveornegative(int n)
	{
		if(n>0)
			return "Positive Number";
		else if(n<0)
			return "Negative Number";
		else
			return "Zero";		
	}

	//SET A2
	public String leapyear(int n)
	{
		if(n%4==0)
			return "Leap Year";
		else
			return "NOT Leap Year";		
	}
	
	//SET B1
	public String profitorloss(double costprice,double sellingprice)
	{
		if(sellingprice>=costprice)
		{
			double profit=sellingprice-costprice;
			return "Profit = "+profit;
		}
		else
		{
			return "Loss = "+(costprice-sellingprice);
		}
	}
	
	//SET B2
	public String printdigitinwords(int n)
	{
		switch(n) 
		{
		case 0:
			return "Zero";
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		default :
			System.out.println("Invalid no");	
		}
		return "Invalid no";
	}

	//SET C1
	/*
	public String vowelorconsonant(char ch)
	{
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
		{
			return "Character is Vowel";
		}
		else
		{
			return "Character is Consonant";
		}	
	}*/
	
	//SET C2
	public void studentclass(int LA,int OR,int DM)
	{
		int total=LA+OR+DM;
		double per=total/3;
		System.out.println("Total Marks = "+total+"Percentage = "+per);
		if(per>=70)
		{
			System.out.println("Class = Distinction");
		}
		else if(per>=60)
		{
			System.out.println("Class = First Class");
		}
		else if(per>=55)
		{
			System.out.println("Class = Higher Second Class");
		}
		else if(per>=50)
		{
			System.out.println("Class = Second Class");
		}
		else if(per>=40)
		{
			System.out.println("Class = Pass Class");
		}
		else
		{
			System.out.println("Class = FAIL");
		}
	}
	
	
	
}
