package javaAssignment9;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return o1.getRollNo() - o2.getRollNo();
	}

}
