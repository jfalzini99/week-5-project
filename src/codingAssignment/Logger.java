package codingAssignment;

// WEEK 5 CODING ASSIGNMENT 
// EDITTED BY - Joseph Falzini

public interface Logger {
	
	/*
	 * 
	 * Abstract methods created here must be instantiated by classes that implement this Interface.
	 * This is known as Polymorphism: the ability for an object to take different forms during runtime.
	 *   
	 */
	
	public void log(String log);
	public void error(String error);
	
}
