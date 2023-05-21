package Restaurant1;

import java.util.Scanner;

//Interface and abstract classes are used to define common characteristics of multiple classes.
//Interface is a collection of methods of abstracts. it holds a set of methods but no method implementation that are going to be used later on
//Abstract is a class that cannot create object directly. they are used as the base or blueprint for providing common behavior for classes that refers to them.


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("====Welcome to los pollos hermanos====");
		System.out.println("1. Order Burger");
		System.out.println("2. Order Chicken");
		System.out.println("3. Order Desert");
		System.out.println("4. Order Fries");
		System.out.println("5. Order Nuggets");
		System.out.println("6. Exit");
		System.out.println("=======================================");
		int num;
		num = sc.nextInt();
		
		switch(num) {
		case 6:
			System.out.println("Thank you for choosing los pollos hermanos");
			break;
		case 1:
			System.out.println("======================");
			System.out.println("1.Cheeseburger");
			System.out.println("2.Beef Burger");
			System.out.println("3.Chicken tender burger");
			System.out.println("4.Bacon Beef Burger");
			System.out.println("5.Jumbo Burger");
			System.out.println("======================");
			int opt;
			opt = sc.nextInt();
			if(opt==1) {
				System.out.println("Enter number of order: ");
				int ord;
				ord=sc.nextInt();
				Burger burger = new Burger("Cheeseburger", 5.99, ord);
				burger.cooking();		
				burger.viewOrder();
				burger.viewPrice();
				System.out.println("Thank you for choosing los pollos hermanos");
				break;
			}
			else if(opt==2) {
				System.out.println("Enter number of order: ");
				int ord2;
				ord2=sc.nextInt();
				Burger burger2 = new Burger("Beef Burger", 10.99, ord2);
				burger2.cooking();		
				burger2.viewOrder();
				burger2.viewPrice();
				System.out.println("Thank you for choosing los pollos hermanos");
				break;
			}
			else if (opt==3) {
				System.out.println("Enter number of order: ");
				int ord3;
				ord3=sc.nextInt();
				Burger burger3 = new Burger("Chicken Tender Burger", 12.99, ord3);
				burger3.cooking();		
				burger3.viewOrder();
				burger3.viewPrice();
				System.out.println("Thank you for choosing los pollos hermanos");
				break;
			}
			else if (opt==4) {
				System.out.println("Enter number of order: ");
				int ord4;
				ord4=sc.nextInt();
				Burger burger4 = new Burger("Bacon Beef Burger", 13.99, ord4);
				burger4.cooking();		
				burger4.viewOrder();
				burger4.viewPrice();
				System.out.println("Thank you for choosing los pollos hermanos");
				break;
			}
			else if(opt==5) {
				System.out.println("Enter number of order: ");
				int ord5;
				ord5=sc.nextInt();
				Burger burger5 = new Burger("Jumbo Burger", 15.99, ord5);
				burger5.cooking();		
				burger5.viewOrder();
				burger5.viewPrice();
				System.out.println("Thank you for choosing los pollos hermanos");
				break;
			}
		case 2:
			System.out.println("Enter number of order: ");
			int Cord;
			Cord=sc.nextInt();
			Chicken a = new Chicken("Chicken", 16, Cord);
			a.cooking();		
			a.viewOrder();
			a.viewPrice();
			System.out.println("Thank you for choosing los pollos hermanos");
			break;
		case 3:
			System.out.println("======================");
			System.out.println("1.Ice cream");
			System.out.println("2.Banana Split");
			System.out.println("3.Cake");
			System.out.println("======================");
			int opt2;
			opt2 = sc.nextInt();
			if(opt2==1) {
				System.out.println("Enter number of order: ");
				int Dord;
				Dord=sc.nextInt();
				Desert b = new Desert("Ice cream", 2, Dord);
				b.cooking();		
				b.viewOrder();
				b.viewPrice();
				System.out.println("Thank you for choosing los pollos hermanos");
				break;
			}
			else if(opt2==2) {
				System.out.println("Enter number of order: ");
				int Dord2;
				Dord2=sc.nextInt();
				Desert c = new Desert("Banana Split", 5, Dord2);
				c.cooking();		
				c.viewOrder();
				c.viewPrice();
				System.out.println("Thank you for choosing los pollos hermanos");
				break;
			}
			else if(opt2==3) {
				System.out.println("Enter number of order: ");
				int Dord3;
				Dord3=sc.nextInt();
				Desert d = new Desert("Cake", 3, Dord3);
				d.cooking();		
				d.viewOrder();
				d.viewPrice();
				System.out.println("Thank you for choosing los pollos hermanos");
				break;
			}
		case 4:
			System.out.println("Enter number of order: ");
			int Ford;
			Ford=sc.nextInt();
			Fries e = new Fries("Fries", 4, Ford);
			e.cooking();		
			e.viewOrder();
			e.viewPrice();
			System.out.println("Thank you for choosing los pollos hermanos");
			break;
		case 5:
			System.out.println("Enter number of order: ");
			int Nord;
			Nord=sc.nextInt();
			Nuggets f = new Nuggets("Fries", 0.5, Nord);
			f.cooking();		
			f.viewOrder();
			f.viewPrice();
			System.out.println("Thank you for choosing los pollos hermanos");
			break;
		}
	}

}
