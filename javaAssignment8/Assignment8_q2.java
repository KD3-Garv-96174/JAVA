package javaAssignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment8_q2 {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.add("blue");
		colors.add("grey");
		colors.add("pink");
		colors.add("black");
		Collections.sort(colors);
		for (String str : colors) {
			System.out.println(str.toString());
		}
	}
}
