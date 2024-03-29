package javaPackage;

public class Company extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void credentails() {
		// TODO Auto-generated method stub
		
	}

}


abstract class Employee 
{
abstract void credentails();
	
	void empDetails()
	{
		System.out.println("The naem of employeee");
		System.out.println("The contact number ");
	}
}
