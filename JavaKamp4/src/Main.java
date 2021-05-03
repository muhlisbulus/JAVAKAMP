

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer=new Customer(1, "122154654651", "Muhlis", "Buluþ", "2001");
		 
		CustomerManager customerManager=new CustomerManager( );
		customerManager.Add(customer);
		
	
		Game game1=new Game(1, "Euro truck", "týr oyunu", 110);
		Game game2=new Game(1, "fifa", "futbol oyunu", 200);
		
		Game[] games= {game1,game2};
		
		GameManager gameManager=new GameManager();
		gameManager.Getall(games);
		
		
		Sale sale=new Sale(1, "25152021710");
		SaleManager saleManager=new SaleManager();
		saleManager.Add(sale);
		
		
	}

}
