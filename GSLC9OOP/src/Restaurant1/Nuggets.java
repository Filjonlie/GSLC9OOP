package Restaurant1;

public class Nuggets extends foodType{
	public Nuggets(String name, double price,int amount) {
		super(name, price,amount);

	}
	
	public void cooking() {
		System.out.println("Please wait for your order to be processed");
		System.out.println("Cooking "+amount+" order(s) of "+name);
	}

}
