package codingAssignment;

// WEEK 5 CODING ASSIGNMENT
// EDITTED BY - Joseph Falzini

public class SpacedLogger implements Logger {
	
	@Override
	public void log(String log) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < log.length(); i++) { 
			builder.append(log.charAt(i));
			builder.append(" ");
		}
		
		System.out.println(builder.toString());
	}

	@Override
	public void error(String error) {
		Logger spacedError = new SpacedLogger();
		
		System.out.print("ERROR: ");
		spacedError.log(error);
	}

	
}
