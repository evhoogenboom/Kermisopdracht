
public class Botsautos extends Attractie {

	Botsautos(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
	
	
	void draaien() {
		System.out.println("De attractie " + naam + " draait.");
	}
	
	
}
