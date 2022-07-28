package codingAssignment;

// WEEK 5 CODING ASSIGNMENT
// EDITTED BY - Joseph Falzini

public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		asterisk.log("Welcome!");
		asterisk.error("Something bad happened!");
		
		System.out.println(); // Used for formatting in Console.
		
		Logger spaced = new SpacedLogger();
		spaced.log("Welcome!");
		spaced.error("Something bad happened!");
	}

}
