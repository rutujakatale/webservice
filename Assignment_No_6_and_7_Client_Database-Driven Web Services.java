package com.mit.services;

public class Assignment5Client {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		java.net.URL endpointUrl = new java.net.URL("http://localhost:8081/Assignment5Server/services/Assignment5Server");
		org.apache.axis.client.Service service= new org.apache.axis.client.Service();
		Assignment5ServerSoapBindingStub stub = new Assignment5ServerSoapBindingStub(endpointUrl,service); 
			
	     String response = stub.displaystudent("101");
	     System.out.println("Student Name : " + response);  

  	     String details = stub.displaystudentrowstring("101");
	     System.out.println("Student Details: " + details);  
	
	}

}
