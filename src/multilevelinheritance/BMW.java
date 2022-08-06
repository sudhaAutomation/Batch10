package multilevelinheritance;

public class BMW extends Car {
String model="BMW002";
String colour="black";
String cost="20L";


public void cardrive() {
	System.out.println("car is ready to drive by the customer");
}
public void selection() {
	System.out.println("selection is over by the customer");
}

	public static void main(String[] args) {
		BMW bm=new BMW();
		System.out.println("model of my BMW is "+bm.model);
		System.out.println("colour of my BMW is "+bm.colour);
		System.out.println("cost of my BMW is "+bm.cost);
		bm.carengine();
		bm.startengine();
		bm.stopengine();
		bm.bodyparts();
		bm.installation();
		bm.cardrive();
		bm.selection();

	}

}
