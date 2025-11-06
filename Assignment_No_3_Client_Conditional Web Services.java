package com.mit.services;

public class Assignment3Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		java.net.URL endpointUrl = new java.net.URL("http://localhost:8081/MScWSA3Server/services/Assignment3Server");
		org.apache.axis.client.Service service= new org.apache.axis.client.Service();
		Assignment3ServerSoapBindingStub stub = new Assignment3ServerSoapBindingStub(endpointUrl,service); 
		
		// SET A1
		String positiveornegativeresult=stub.positiveornegative(-20);
		System.out.println("Positive or Negative = "+positiveornegativeresult);
		
		// SET A2
		String leapyearresult=stub.leapyear(2021);
		System.out.println("Leapyear Result= "+leapyearresult);
		
		//SET B1
		String profitorlossresult=stub.profitorloss(100,70);
		System.out.println("Seller has = "+profitorlossresult);
		
		//SET B2
		String printdigitinwordsresult=stub.printdigitinwords(0);
		System.out.println("Digit in Words = "+printdigitinwordsresult);
		
		//SET C1
		//String vowelorconsonantsresult=stub.vowelorconsonant('a');
		//System.out.println("Vowel or Consonants result = "+vowelorconsonantsresult);
		
		//SET C2
		stub.studentclass(39,40,40);

		
	}

}
