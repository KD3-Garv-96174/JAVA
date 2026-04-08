package javaAssignment2;

import java.util.Scanner;

class Invoice {
    private String partName;
    private String partDiscription;
    private int quantity;
    private double price;
    
    public Invoice() {
    	this.partName = " ";
    	this.partDiscription = " ";
    	this.quantity = 0;
    	this.price = 0.0;
    }
    public Invoice(String partName , String partDiscription , int quantity , double price) {
    	this.partName = partName;
    	this.partDiscription = partDiscription;
    	setQuantity(quantity);
    	setPrice(price);
    }

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getPartDiscription() {
		return partDiscription;
	}

	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) {
			this.quantity = 0;
		}else {
		this.quantity = quantity;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0) {
			this.price = 0.0;
		}else {
		this.price = price;
		}
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter partName : ");
		this.partName = sc.next();
		System.out.println("Enter partDiscription : ");
		this.partDiscription = sc.next();
		System.out.println("Enter quantity : ");
        setQuantity(sc.nextInt());
		System.out.println("Enter price : ");
		setPrice(sc.nextInt());
		}
    public double calculateInvoice() {
    	double amount = this.quantity * this.price;
		return amount;
    }
    public void displayInvoice() {
    	System.out.println("part : " + getPartName());
    	System.out.println("desc. : " + getPartDiscription());
    	System.out.println("Quantity : " + getQuantity());
    	System.out.println("price : " + getPrice());
    	System.out.println("TotalAmount : " + calculateInvoice());
    }
    
}
public class InvoiceTest {
      public static void main(String[] args) {
		Invoice i = new Invoice();
		i.acceptRecord();
		i.displayInvoice();
	}
}
