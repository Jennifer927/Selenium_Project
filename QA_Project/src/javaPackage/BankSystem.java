package javaPackage;

public class BankSystem {

	int acct=5000;
	void deposit(int dep)
	{
		acct=acct+dep;
		System.out.println("The amount after the deposit"+acct);
	}
	void withdraw(int wt)
	{
		acct=acct-wt;
		System.out.println("The amount after the withdraw"+acct);
	}
	
	int dissplay()
	{
		return acct;
	}
	
	
	public static void main(String[] args) {
		// Create a object
		BankSystem obj= new BankSystem();
		obj.deposit(2000);
		obj.withdraw(1000);
		System.out.println(obj.dissplay());
		
	}

}
