package constructor1;

public class childcons extends cons {
	public childcons() {
		super();
		System.out.println("childclass default constrctor");
	}

	public childcons(int j) {
		super(1000);
		System.out.println("childclass default constrctor "+j);
	}

	public childcons(String name) {
		super(200,"test");
		System.out.println("childclass default constrctor "+name);
	}

	public static void main(String[] args) {
		new childcons();
//		new childcons(100000);
//		new childcons("Swhizz");
	}

}
