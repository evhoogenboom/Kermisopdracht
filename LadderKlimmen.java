
public class LadderKlimmen extends Attractie implements GokAttractie {
	
	LadderKlimmen(String attractieNummer, String naam, double prijs, int oppervlakte) {
		this.attractieNummer = attractieNummer;
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}
	
	
	
	
	@Override
	void draaien() {
		System.out.println("De attractie " + naam + " draait.");
	}

	public double kansspelbelastingBetalen() {
		double belasting = attractieOmzet*belastingTarief;
		attractieOmzet -= belasting; // goed
		return belasting;
	}
	
}
