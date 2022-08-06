package multipleinheritance;

public interface Project {
	
	
	int min_bal=2000;

	public void educationloan() ;//abstarct method
	public void scholorship();
}
//interface :will not have the main method
//this contains only abstract methods
//abstarct methods are not implemented with the method body
//the variables available in the interface are final in nature,can't be initialised with out value
//for interface we can't create an object'