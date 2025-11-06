package com.mit.services;
public class Assignment1Client {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		java.net.URL endpointUrl = new java.net.URL("http://localhost:8081/MScWSA1Server/services/Assignment1");
		org.apache.axis.client.Service service= new org.apache.axis.client.Service();
		Assignment1SoapBindingStub stub = new Assignment1SoapBindingStub(endpointUrl,service); 
		
		// SET A1
		int addresult=stub.add(20,11);
		System.out.println("Addition = "+addresult);
		
		int subresult=stub.sub(20,10);
		System.out.println("Subtraction = "+subresult);
		
		int multresult=stub.mult(20,10);
		System.out.println("Multiplication = "+multresult);
		
		int divresult=stub.div(20,10);
		System.out.println("Division = "+divresult);
		
		double areaoftriangleresult=stub.areaoftriangle(3, 5);
		System.out.println("Area of Triangle = "+areaoftriangleresult);

		double surfacearearesult=stub.surfacearea(4,5,6);
		System.out.println("Surface Area of Cuboid= "+surfacearearesult);

		double volumeresult=stub.volume(4,5,6);
		System.out.println("Volume of Cuboid = "+volumeresult);
		
		double distanceresult=stub.distance(4,5,10,11);
		System.out.println("Distance = "+distanceresult);

		int totalresult=stub.total(56,78,68,89,59,91);
		System.out.println("Total Marks = "+totalresult);
	
		double percentageresult=stub.percentage(totalresult);
		System.out.println("Percentage = "+percentageresult);
		
		double areaofcircleresult=stub.areaofcircle(4.5);
		System.out.println("Area of Circle = "+areaofcircleresult);
	
		double volumeofcircleresult=stub.volumeofcircle(4.5,3);
		System.out.println("Volume of Circle = "+volumeofcircleresult);
		
	}

}
