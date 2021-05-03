
public class SaleManager {
	
	void Gamer(Sale sale,Game game,Customer customer,Campain campain) {
		System.out.println("Adý : "+ customer.getFirstName() +" sistemde yazýlan kiþiye  þu kampanya indirimi uygulanarak" 
				+campain.getDiscount() + "Adý : " +game.getName() +" Sistemde yazýlan oyunun satýþý yapýlmýþtýr : " +sale.getId() 
				 + "Satýþ sýrasý sistemdeki gibidir.");
	} 
	void Add(Sale sale) {
		System.out.println("Satýþ eklendi : " +sale.getId());
		
	}
	void Delete(Sale sale) {
		System.out.println("Satýþ Silindi : " +sale.getId());
	}
    void Update(Sale sale) {
    	System.out.println("Satýþ güncellendi : " +sale.getId());
    }
}
