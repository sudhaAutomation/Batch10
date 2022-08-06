package multipleinheritance;

public class Swhizzbank implements Sbi,ICICI,Hdfc {
	
	public static void main(String[] args) {
		
		Swhizzbank bank=new Swhizzbank();
		bank.instantaccountopening();
		bank.personalloan();
		System.out.println(Project.min_bal);
		
	}

	@Override
	public void instantaccountopening() {
		System.out.println("instantaccountopened successfully");
		
	}

	@Override
	public void personalloan() {
		System.out.println("personal loan feature created successfully");
	}

	@Override
	public void fixedeposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ATM() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void netbanking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smartspeding() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void digitalmarketing() {
		// TODO Auto-generated method stub
		
	}

}
