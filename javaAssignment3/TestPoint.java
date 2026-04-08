package javaAssignment3;

import java.util.Scanner;

class Point2D{
	private double x;
	private double y;
	
	public Point2D(double x , double y) {
		this.x = x;
		this.y = y;
	}
	public String getDetails() {
		return "points : " + x + " , " + y ;
	}
    public boolean isEqual(Point2D other) {
		return this.x == other.x && this.y == other.y;
	}
    public double calculateDistance(Point2D other) {
    	return Math.sqrt(Math.pow(other.x - this.x , 2) + Math.pow(other.y - this.y , 2));
    }
}
public class TestPoint {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x & y Co-ords for point 1 : ");
		Point2D p1 = new Point2D(sc.nextDouble(),sc.nextDouble());
		System.out.println(p1.getDetails());
		
		System.out.println("Enter x & y Co-ords for point 2 : ");
		Point2D p2 = new Point2D(sc.nextDouble(),sc.nextDouble());
		System.out.println(p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("points p1 & p2 are at same position");
		}else {
			System.out.println("points are at differnt positions");
			double distance = p1.calculateDistance(p2);
			System.out.println("Distance between 2 points is : " + distance);
		}
		
	}
}
