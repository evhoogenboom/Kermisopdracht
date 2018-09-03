
public class Spin extends RisicoRijkeAttractie implements GokAttractie {
	
	Spin(String naam, double prijs, int oppervlakte) {
		this(naam, prijs, oppervlakte, 5);
	}
	
	Spin(String naam, double prijs, int oppervlakte, int draaiLimiet) {
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
		this.draaiLimiet = draaiLimiet;
		
		keuringNogGeldig = opstellingsKeuring();
	}
	
	
	@Override
	void draaien() throws KeuringsException {
		if (!keuringNogGeldig) {
			throw new KeuringsException();
		} 
		System.out.println("De attractie " + naam + " draait.");
		keuringNogGeldig = keuringNogGeldig();
	}
	
	
	
	
	
}