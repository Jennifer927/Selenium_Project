package javaPackage;

public class InheritanceClass implements Registration {
  
	void countRegAmt(int amt)
	{
		System.out.println("Print the amount "+amt);
	}
	
	void countRegAmt(double amt)

	{
		System.out.println("Print the mount "+amt);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceClass obj1= new InheritanceClass();
		// method overloading 
		obj1.countRegAmt(1000);
		obj1.countRegAmt(100.50);
		
	College obj=new College();
		obj.colName();
		obj.department();
		// method overriding 
		obj.branch();
	}

	@Override
	public void addName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void course() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fees() {
		// TODO Auto-generated method stub
		
	}

}


class University
{
	
  protected void department()
	{
		System.out.println("The department in University");
	}
	
	void branch()
	{
		System.out.println("The branch in University");
	}
}


class College extends University
{
	void colName()
	{
		System.out.println("The college Name");
	}
	
	void branch()
	{
		System.out.println("The branch name is IT");
	}

}