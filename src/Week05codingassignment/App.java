package Week05codingassignment;

public class App {

	public static void main(String[] args) {
		String hello = "Hello";
		SpacedLogger sl = new SpacedLogger();
		AsteriskLogger al = new AsteriskLogger();
		al.log(hello);
		al.error(hello);
		sl.log(hello);
		sl.error(hello);
		
	}

}
