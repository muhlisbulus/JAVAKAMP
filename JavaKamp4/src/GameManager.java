
public class GameManager {
	void Add(Game game) {
		System.out.println("Oyun Eklendi:"+game.getName());
		
	}
	void Delete(Game game) {
		System.out.println("Oyun Silindi:"+game.getName());
	}
	void Update(Game game) {
		System.out.println("Oyun G�ncellendi :"+game.getName());
	}
     void Getall(Game[] games) {
    	 for (Game game : games) {
    		 System.out.println("b�t�n oyunlar a�a��daki gibidir  :" +game.getName());
			
		}
    	 
     }
}
