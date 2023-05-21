package Restaurant1;

public abstract class foodType implements Order {
	String name;
	double price;
	int amount;
	
	public foodType(String name, double price, int amount) {
		this.name=name;
		this.price=price;
		this.amount=amount;
	}
	
	public abstract void cooking();
	
	
	public void viewOrder() {
		System.out.println("Item: "+amount+ " "+name);
	}
	
	public void viewPrice() {
		System.out.println("$"+price*amount);
	}

}
