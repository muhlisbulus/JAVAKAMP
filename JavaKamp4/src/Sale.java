
public class Sale {
	private int id;
	private String CreditCardNo;
	
	public Sale(int id, String creditCardNo) {
		
		this.id = id;
		CreditCardNo = creditCardNo;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCreditCardNo(String creditCardNo) {
		CreditCardNo = creditCardNo;
	}
	
	
	

}
