package com.mit.services;

public class Assignment4Server {
	
	//SET A1
	public static int power(int x,int y)
	{
		int i,res=1;
		for(i=1;i<=y;i++)
		{
			res=res*x;
		}
		return (res);
	}
	
	//SET A2
	public static String perfect(int n)
	{
		int i,sum=0;
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			sum=sum+i;
		}
		if(n==sum)
		{		    return("Perfect Number");}
		else
		{	return("NOT Perfect Number");}
	}

	//SET B1
	public static int factorial(int n)
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return (fact);
	}

	//SET B2
	public static int reverse(int n)
	{
		int rem,rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rem+rev*10;
			n=n/10;
		}
		return (rev);
	}
	
	//SET C1
		public static String palindromenumber(int n)
		{
			int t=n,rem,rev=0;
			while(n>0)
			{
				rem=n%10;
				rev=rem+rev*10;
				n=n/10;
			}
			if(rev==t)
				return "Palindrome Number";
			else
				return "NOT Palindrome Number";
		}
	
		//SET C2
		public static String armstrongnumber(int n)
		{
			int t=n,rem,sum=0;
			while(n>0)
			{
				rem=n%10;
				sum=sum+rem*rem*rem;
				n=n/10;
			}
			if(sum==t)
				return "Armstrong Number";
			else
				return "NOT Armstrong Number";
		}
	
		//SET B3
		public static int vowelcount(String s)
		{
			int i,cnt=0;
			char ch;
			for(i=0;i<s.length();i++)
			{
				ch=s.charAt(i);
				if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
				{
					cnt++;
				}
			}
			return (cnt);
		}
	
		//SET C3) to convert decimal number to Binary, Octal, HexaDecimal
		public static void convertDecimal(int number) {
		    System.out.println("Binary: " + Integer.toBinaryString(number));
		    System.out.println("Octal: " + Integer.toOctalString(number));
		    System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
		}
	
}


