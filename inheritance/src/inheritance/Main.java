package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer m�cahit = new IndividualCustomer();
		m�cahit.customerNumber="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {m�cahit, abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
		
	}

}
