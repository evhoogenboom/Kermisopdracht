
public class Spiegelpalijs extends Attractie {
	
	Spiegelpalijs(String naam, double prijs, int oppervlakte) {
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}
	
	@Override
	void draaien() {
		System.out.println("De attractie " + naam + " draait.");
	}
	
	
	
}
