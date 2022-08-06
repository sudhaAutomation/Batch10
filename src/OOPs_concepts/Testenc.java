package OOPs_concepts;

public class Testenc {

	public static void main(String[] args) {
		Encapsulation enc1=new Encapsulation();
enc1.setmailid("admin@admin.com");
enc1.setpassword("admin123");
System.out.println("my new recovery email id"+enc1.getmailid());
System.out.println("muy new password "+enc1.getpassword());
	}

}
