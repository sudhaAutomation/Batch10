package realscenario;

public abstract class Yokohama implements Designer  {
	public void enginedesign() {
		System.out.println("engine designed");
	}
	public void startengine() {
		System.out.println("engine started successfully");
	}
	public void stopengine() {
		System.out.println("engine stoped successfully");
	}
	public abstract void carpartsdesign();
	
	
}
