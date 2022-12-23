package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
	
	Logger asteriskLogger = new AsteriskLogger();
	asteriskLogger.Log("Peas");
	System.out.println();
	asteriskLogger.Error("Peas");
	System.out.println();
	
	Logger spacedLogger = new SpacedLogger();
	spacedLogger.Log("Carrots");
	System.out.println();
	spacedLogger.Error("Carrots");
	System.out.println();
	
	}

}
