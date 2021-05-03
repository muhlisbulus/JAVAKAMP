
public class CustomerManager implements PersonManager  {

	void Add(Customer customer) {
	
		System.out.println("Müþteri Ekleme iþlemi tamamlandý : " + customer.getFirstName());
		
	}
	void Delete(Customer customer) {
		System.out.println("Müþteri Silindi" +customer.getFirstName());
	}
	void Update(Customer customer) {
		
	}
	
	void getALL(Customer[] customers) {
		for (Customer customer : customers) {
			System.out.println("Þuana kadar eklenen müþteri listesi : " +customer.getFirstName());
		}
		
	}
	@Override
	public boolean checkPerson(Customer customer) {
		
		
		return false;
	}
	
	
}
