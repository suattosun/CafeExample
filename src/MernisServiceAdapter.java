
public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		if(customer.getNationalId() == "55555666")
		{
			return true;
		}
		return false;
	}

}
