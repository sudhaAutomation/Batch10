package OOPs_concepts;

public class inheritancechild extends inheritanceparent{
	
	
	public void category_list() {
		System.out.println("categories added succesfully");
	}
	public void sendBulkMessages() {
		System.out.println("send bulk message module created successfully");
	}


	public static void main(String[] args) {
		inheritancechild inh=new inheritancechild();
		System.out.println(inh.a);
		System.out.println(inh.appname);
		inh.login();
		inh.courses();
		inh.category_list();
		inh.sendBulkMessages();
	}

}
