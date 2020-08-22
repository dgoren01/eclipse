package pack1;

public class Example1 {
	long accnum=12345678910l;
	String accname="deepak";
	int amount=10000;
	
	public void accbalance()
	{
	System.out.println("balance amount is "+amount);	
		
    
	}
	public static void main(String[] args) 
	{
		Example1 obj=new Example1();
		obj.accbalance();
    
	}
}
