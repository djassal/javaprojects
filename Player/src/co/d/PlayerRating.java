package co.d;

public class PlayerRating {
	public static void main(String[] args) {
		
		Player p1 = new CricketPlayer("John", "Doe", 23);
		p1.getname();
		System.out.println(p1.getname());
		p1.getRating();
		System.out.println(p1.getRating());
		
		Player p2 = new FootballPlayer("John", "Doe", 23);
		p2.getname();
		System.out.println(p2.getname());
		p2.getRating();
		System.out.println(p2.getRating());
	}
}
