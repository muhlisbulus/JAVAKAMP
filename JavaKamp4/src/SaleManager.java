
public class SaleManager {
	
	void Gamer(Sale sale,Game game,Customer customer,Campain campain) {
		System.out.println("Ad� : "+ customer.getFirstName() +" sistemde yaz�lan ki�iye  �u kampanya indirimi uygulanarak" 
				+campain.getDiscount() + "Ad� : " +game.getName() +" Sistemde yaz�lan oyunun sat��� yap�lm��t�r : " +sale.getId() 
				 + "Sat�� s�ras� sistemdeki gibidir.");
	} 
	void Add(Sale sale) {
		System.out.println("Sat�� eklendi : " +sale.getId());
		
	}
	void Delete(Sale sale) {
		System.out.println("Sat�� Silindi : " +sale.getId());
	}
    void Update(Sale sale) {
    	System.out.println("Sat�� g�ncellendi : " +sale.getId());
    }
}
