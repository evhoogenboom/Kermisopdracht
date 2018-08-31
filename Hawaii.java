

public class Hawaii extends RisicoRijkeAttractie {
	
	Hawaii(String attractieNummer, String naam, double prijs, int oppervlakte) {
		this(attractieNummer, naam, prijs, oppervlakte, 10);
	}
	
	Hawaii(String attractieNummer, String naam, double prijs, int oppervlakte, int draaiLimiet) {
		this.attractieNummer = attractieNummer;
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
		this.draaiLimiet = draaiLimiet;
		
		keuringNogGeldig = opstellingsKeuring();
	}
	
	@Override
	void draaien() throws KeuringsException  {
		if (!keuringNogGeldig()) {
			throw new KeuringsException();
		} 
		System.out.println("De attractie " + naam + " draait.");
	}
	
	
	
	
}