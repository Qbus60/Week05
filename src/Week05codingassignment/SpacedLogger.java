package Week05codingassignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String message) {
		String newMessage = "";
		for (int i = 0; i < message.length(); i++) {
			newMessage += message.charAt(i)+ " ";
		}
		
		System.out.println(newMessage.trim());
	}

	@Override
	public void error(String message) {
		String newMessage = "";
		for (int i = 0; i < message.length(); i++) {
			newMessage += message.charAt(i)+ " ";
		}
		System.out.println("ERROR: " + newMessage.trim());
		 
	}
	

}
