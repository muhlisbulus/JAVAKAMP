
public class CustomerManager implements Logger  {

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
	public void log(String mesage) {
		System.out.println("E devlet sistemine göre doðrulanan muþteri kayýdý yapýlmýþtýr" +mesage);
		
	}
}
