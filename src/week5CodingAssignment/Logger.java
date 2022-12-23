package week5CodingAssignment;

public interface Logger { //Holds the method declaration used in the classes (Asterisk & Space) 

	public void Log(String log); //declared, not defined *behavior* - implement on the asterisk & space class
	public void Error(String error); //signatures of methods we want any class that implements logger to have
	

}
