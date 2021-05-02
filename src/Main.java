
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager2 = new StarbuckCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setDate("18.02.1975");
		customer.setFirstName("ahmet");
		customer.setLastName("saka");
		customer.setNationalId("55555666");
		customer.setId(1);
		customerManager2.Save(customer);
	}

}
