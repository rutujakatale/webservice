package com.mit.services;

public class Assignment5Client {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		java.net.URL endpointUrl = new java.net.URL("http://localhost:8081/Assignment5Server/services/Assignment5Server");
		org.apache.axis.client.Service service= new org.apache.axis.client.Service();
		Assignment5ServerSoapBindingStub stub = new Assignment5ServerSoapBindingStub(endpointUrl,service); 
			
	     String response = stub.greetUser("Anuj");
	     System.out.println("RPC Response: " + response);
	    
	     double result = stub.celsiusToFahrenheit(37);
	     System.out.println("RPC Response: 37°C = " + result + "°F");
	       
	     String valid = stub.validateEmail("user@example.com");
	     String invalid = stub.validateEmail("invalid-email");

	     System.out.println(valid);
	     System.out.println(invalid);
	
       
	     String valid1 = stub.validateMobile("8796687965");
	     String invalid1 = stub.validateMobile("12345");

	     System.out.println(valid1);
	     System.out.println(invalid1);
	     
	       
	 
	     double usd = stub.convertFromRupees(1000, "dollar");
	     double eur = stub.convertFromRupees(1000, "euro");
	     double gbp = stub.convertFromRupees(1000, "pound");

	     System.out.println("1000 INR = " + usd + " USD");
	     System.out.println("1000 INR = " + eur + " EUR");
	     System.out.println("1000 INR = " + gbp + " GBP");
	    

	     String[] javaSuggestions = stub.getSuggestions("java");
	     String[] pythonSuggestions = stub.getSuggestions("py");

	     System.out.println("Suggestions for 'java':");
	     for (String s : javaSuggestions) 
	     {
	        System.out.println(" - " + s);
	     }

	     System.out.println("\nSuggestions for 'py':");
	     for (String s : pythonSuggestions) 
	     {
	       System.out.println(" - " + s);
	     }
	
	}

}
