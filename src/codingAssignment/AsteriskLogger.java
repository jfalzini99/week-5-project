package codingAssignment;

// WEEK 5 CODING ASSIGNMENT 
// EDITTED BY - Joseph Falzini

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		int asterisks = error.length() + 13;	// +13 is used for even printing in the Console to match the format in the homework; accounts for 
		                                        // the 3 asterisk on both sides of the string, and the String "Error: " (space included).
		
		for (int i = 0; i < asterisks; i++) {
			System.out.print("*");
		}
		
		System.out.println();	// USED FOR SPACING IN THE CONSOLE
		
		System.out.println("***" + "ERROR: " + error + "***");
		
		for (int i = 0; i < asterisks; i++) {
			System.out.print("*");
		}
		
		System.out.println();	// USED FOR SPACING IN THE CONSOLE
	}

}
