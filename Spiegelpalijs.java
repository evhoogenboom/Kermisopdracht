
public class Spiegelpalijs extends Attractie {
	
	Spiegelpalijs(String attractieNummer, String naam, double prijs, int oppervlakte) {
		this.attractieNummer = attractieNummer;
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}
	
	@Override
	void draaien() {
		System.out.println("De attractie " + naam + " draait.");
	}
	
	
	
}