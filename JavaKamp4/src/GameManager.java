
public class GameManager {
	void Add(Game game) {
		System.out.println("Oyun Eklendi:"+game.getName());
		
	}
	void Delete(Game game) {
		System.out.println("Oyun Silindi:"+game.getName());
	}
	void Update(Game game) {
		System.out.println("Oyun Güncellendi :"+game.getName());
	}
     void Getall(Game[] games) {
    	 for (Game game : games) {
    		 System.out.println("bütün oyunlar aþaðýdaki gibidir  :" +game.getName());
			
		}
    	 
     }
}
