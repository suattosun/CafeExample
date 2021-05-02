
public class StarbuckCustomerManager extends BaseCustomerManager {
	ICustomerCheckService customerCheckService;
	
	public StarbuckCustomerManager(ICustomerCheckService customerCheckService) {
		 
		this.customerCheckService = customerCheckService;
	}
	@Override
	public  void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer))
		{
			System.out.println("save to db:" + customer.getFirstName());
		}
		else
		{
		System.out.println("Not a valid person");
		}
		
	}

 

	
}
