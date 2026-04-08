package javaAssignment4;

import java.util.Scanner;

abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;

	public Fruit(String color, double weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "name : " + name + " color : " + color + "weight : " + weight;
	}

	public abstract String taste();
}

class Apple extends Fruit {
	public Apple(String color, double weight) {
		super("Apple", weight, color);
	}

	@Override
	public String taste() {
		return "sweet and sour";
	}
}

class Mango extends Fruit {
	public Mango(String color, double weight) {
		super("Mango", weight, color);
	}

	@Override
	public String taste() {
		return "sweet";
	}
}

class Orange extends Fruit {
	public Orange(String color, double weight) {
		super("Orange", weight, color);
	}

	@Override
	public String taste() {
		return "sour";
	}
}

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basket Size : ");
		int n = sc.nextInt();
		Fruit[] basket = new Fruit[n];
		int count = 0;
		int choice;
		do {
			System.out.println(
					"1. Add Mango\n2. Add Orange\n3. Add Apple\n4. Display Names\n5. Display All Fresh\n6. Display Stale Tastes\n7. Mark Stale\n8. Mark Sour Stale");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				if (count < basket.length) {
					System.out.println("Enter color and weight");
					int c = count++;
					basket[c] = new Mango(sc.next(), sc.nextDouble());
				} else {
					System.out.println("Basket full");
				}
				break;
			}
			case 2: {
				if (count < basket.length) {
					System.out.println("Enter color and weight");
					int c = count++;
					basket[c] = new Orange(sc.next(), sc.nextDouble());
				} else {
					System.out.println("Basket full");
				}
				break;
			}
			case 3: {
				if (count < basket.length) {
					System.out.println("Enter color and weight");
					int c = count++;
					basket[c] = new Apple(sc.next(), sc.nextDouble());
				} else {
					System.out.println("Basket full");
				}
				break;
			}
			case 4: {
				for (Fruit f : basket) {
					if (f != null) {
						System.out.println(f.getName());
					}
				}
				break;
			}
			case 5: {
				for (Fruit f : basket) {
					if (f != null && f.isFresh()) {

						System.out.println(f.toString() + "Taste : " + f.taste());
					}
				}
			}
			case 6: {
				for (Fruit f : basket) {
					if (f != null && !f.isFresh()) {
						System.out.println(f.toString() + "Taste : " + f.taste());
					}
				}
				break;

			}
			case 7: {
				System.out.print("Enter index :");
                int index = sc.nextInt();
                if (index >= 0 && index < count) {
                	basket[index].setFresh(false);
                }
                else System.out.println("Invalid index!");
                break;
			}
			case 8: {
                for(Fruit f : basket) {
                	if(f != null && f.taste().equals("sour")) {
                		f.setFresh(false);
                	}
                }System.out.println("All sour fruits marked stale ");
			}
				break;
			}
		} while (choice != 0);
	}
}
