package workjavapkg;

public class Inheritance {

	public static void main(String[] args) {
		
		Mustang m = new Mustang();
		m.mustangColors();
	}

}

class Vehicle {
	String vehicleTypes = "Four Wheeler";
	public void milage() {
		System.out.println("Average Milage is 30km/hr");
	}
	String color() {
		String col = "black";
		return col;
	}
}

class Mustang extends Vehicle{
	public void mustangMilage() {
		System.out.println("Milage of mustang is 45km/hr");
	}
	void mustangColors() {
		System.out.println("White,Green,Orange,Blue,"+ super.color()+"\n"+super.vehicleTypes);
	}
}