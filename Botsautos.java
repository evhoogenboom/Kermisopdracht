
public class Botsautos extends Attractie {

	Botsautos(String attractieNummer, String naam, double prijs, int oppervlakte) {
		super(attractieNummer, naam, prijs, oppervlakte);
	}
	
	
	void draaien() {
		System.out.println("De attractie " + naam + " draait.");
	}
	
	
}
