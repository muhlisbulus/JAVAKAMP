
public class CustomerManager implements Logger  {

	void Add(Customer customer) {
	
		System.out.println("M��teri Ekleme i�lemi tamamland� : " + customer.getFirstName());
		
	}
	void Delete(Customer customer) {
		System.out.println("M��teri Silindi" +customer.getFirstName());
	}
	void Update(Customer customer) {
		
	}
	
	void getALL(Customer[] customers) {
		for (Customer customer : customers) {
			System.out.println("�uana kadar eklenen m��teri listesi : " +customer.getFirstName());
		}
		
	}
	@Override
	public void log(String mesage) {
		System.out.println("E devlet sistemine g�re do�rulanan mu�teri kay�d� yap�lm��t�r" +mesage);
		
	}
}
