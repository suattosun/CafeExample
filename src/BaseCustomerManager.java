
public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("save to db:" + customer.getFirstName());
		
	}

}
