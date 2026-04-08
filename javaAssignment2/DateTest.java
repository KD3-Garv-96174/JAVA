package javaAssignment2;


class Date{
	private int day;
	private int month;
	private int year;
	
	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}
	public Date(int day , int month , int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	public void displayDate() {
		System.out.printf("%d/%d/%d%n", month, day, year);
	}
}
public class DateTest {
       public static void main(String[] args) {
		Date d = new Date();
		System.out.println("Initial Date : ");
		d.displayDate();
		d.setDay(29);
		d.setMonth(3);
		d.setYear(2026);
		System.out.println("Updated Date");
		d.displayDate();
	}
}
