package javaPackage;

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccoutInfo obj= new AccoutInfo();
		obj.setAcct(100001);
		obj.setUsernamee("Jennifer");
		
		System.out.println(obj.getAcct());
		System.out.println(obj.getusername());
	}

}

class AccoutInfo
{
	private int acctNo;
	private String username;
	
	void setAcct(int acct1)
	{
		acctNo=acct1;
	}
	
	void setUsernamee(String user)
	{
		username=user;
	}
	
	int getAcct()
	{
		return acctNo;
	}
	
	String getusername()
	{
		return username;
	}
}