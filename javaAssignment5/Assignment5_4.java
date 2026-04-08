package javaAssignment5;

enum TrafficLight {

	RED(30), GREEN(45), YELLOW(5);

	private final int duration;

	TrafficLight(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public int setDuration() {
		return duration;
	}
}

public class Assignment5_4 {
	public static void main(String[] args) {
		TrafficLight[] tl = TrafficLight.values();
		for (TrafficLight t : tl) {
			System.out.println(t.ordinal() + "-" + t.name() + "-" + t.getDuration() + "sec");
		}

	}
}
