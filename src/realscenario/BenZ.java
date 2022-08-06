package realscenario;

public class BenZ extends Yokohama {

	public static void main(String[] args) {
		BenZ car=new BenZ();
car.cardesign();
car.enginedesign();
car.carpartsdesign();
car.assembleparts();
car.cardriver();
car.startengine();
car.stopengine();

	}

	@Override
	public void cardesign() {
		System.out.println("Benz car designed successfully by designer");
		
	}

	@Override
	public void assembleparts() {
		System.out.println("assembled parts successfully");
		
	}

	@Override
	public void cardriver() {
		System.out.println("car is ready to drive on road");
		
	}

	@Override
	public void carpartsdesign() {
		System.out.println("parts designed successfully");
		
	}

}
