package pack1;

public class cars {
	
	String carname;
	int cost;
	
	public void primecars(String name,int price) {
		carname=name;
		cost=price;
		System.out.println("car name is "+carname+" and car price is "+cost);
		
	}
	public void lowbudgetcars(String name,int price) {
		carname=name;
		cost=price;
		System.out.println("car name is "+carname+" and car price is "+cost);
		
	}
	

	public static void main(String[] args) {
		
		cars car=new cars();
		car.primecars("audi", 2000000);
		car.primecars("BMW", 300000);
		car.lowbudgetcars("swift", 500000);
		

	}

}
