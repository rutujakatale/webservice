package com.mit.services;

public class Assignment4Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		java.net.URL endpointUrl = new java.net.URL("http://localhost:8081/MScWSA4Server/services/Assignment4Server");
		org.apache.axis.client.Service service= new org.apache.axis.client.Service();
		Assignment4ServerSoapBindingStub stub = new Assignment4ServerSoapBindingStub(endpointUrl,service); 
		
		// SET A1
		int powerresult=stub.power(2,5);
		System.out.println("Power Result = "+powerresult);
		
		// SET A2
		String perfectresult=stub.perfect(496);
		System.out.println("Perfect Result = "+perfectresult);
		
		// SET B1
		int factorialresult=stub.factorial(5);
		System.out.println("Factorial Result = "+factorialresult);

		// SET B2
		int reverseresult=stub.reverse(1234);
		System.out.println("Reverse Result = "+reverseresult);
		
		// SET C1
		int originalno=1224;
		int rev=stub.reverse(originalno);
		if(originalno==rev)
			System.out.println("Palindrome Number");
		else
			System.out.println("NOT Palindrome Number");
		
		// SET C1
		String palindromenumberresult=stub.palindromenumber(1213);
		System.out.println("Palindrome Number = "+palindromenumberresult);
		
		// SET C2
		String armstrongnumberresult=stub.armstrongnumber(154);
		System.out.println("Armstrong Number = "+armstrongnumberresult);

		// SET B3
		int vowelcountresult=stub.vowelcount("Anuja");
		System.out.println("Vowel Count = "+vowelcountresult);
		
		// SET C3
		stub.convertDecimal(123);
	}

}
