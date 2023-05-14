package ClassPack;

public class TrafficLight {
	protected String color = "";
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	protected int duration = 0;
	
	public void change() {
		if (color.equals("red")) {
			System.out.println("STOP");
		} else if (color.equals("orange")) {
			System.out.println("READY");
		} else if (color.equals("green")) {
			System.out.println("GO");
		}
	}
	
}
