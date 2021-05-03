
public class Game {
	private int id;
	private String Name;
	private String Description;
	private int DailyPrice;
	public Game(int id, String name, String description, int dailyPrice) {
		
		this.id = id;
		Name = name;
		Description = description;
		DailyPrice = dailyPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getDailyPrice() {
		return DailyPrice;
	}
	public void setDailyPrice(int dailyPrice) {
		DailyPrice = dailyPrice;
	}
	
	

}
