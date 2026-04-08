package javaAssignment3;

import java.util.Scanner;

class CreditLimitCalculator{
	private int accountNumber;
	private double beginningBalance;
	private double totalCharges;
	private double totalCredit;
	private double creditLimit;
	
	public CreditLimitCalculator(int accountNumber , double beginningBalance , double totalCharges , double totalCredit , double creditLimit) {
		this.accountNumber = accountNumber;
		this.beginningBalance = beginningBalance;
		this.totalCharges = totalCharges;
		this.totalCredit = totalCredit;
		this.creditLimit = creditLimit;
	}
	public double calculateNewBalance() {
		return beginningBalance + totalCharges - totalCredit;
	}
	public void displaySummary() {
		double newBalance = calculateNewBalance();
		System.out.println("Account Number : " + accountNumber);
		if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Balance is within the credit limit");
        }
	}
}
public class CreditLimitCheck {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Account Number : ");
	    int acc = sc.nextInt();
	    
	    System.out.print("Enter Beginning Balance: ");
        double bBal = sc.nextInt();

        System.out.print("Enter Total Charges: ");
        double charges = sc.nextInt();

        System.out.print("Enter Total Credits: ");
        double credits = sc.nextInt();

        System.out.print("Enter Credit Limit: ");
        double limit = sc.nextInt();
	    
        CreditLimitCalculator clc = new CreditLimitCalculator(acc, bBal, charges, credits, limit);
        clc.displaySummary();
        
	}
}
