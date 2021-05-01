package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer m�cahit = new Customer(1, "M�cahit", "Kahraman");
		
		customerManager.add(m�cahit);
		
		
	}

}
