package multilevelinheritance;

public class Jaguar extends Car {
	String model="JG002";
	String colour="Red";
	String cost="70L";
	

public void cardrive() {
	System.out.println("car is ready to drive by the customer");
}
public void selection() {
	System.out.println("selection is over by the customer");
}

	public static void main(String[] args) {
		Jaguar JG=new Jaguar();
		System.out.println(JG.model);
		System.out.println(JG.colour);
		System.out.println(JG.cost);

	}

}
