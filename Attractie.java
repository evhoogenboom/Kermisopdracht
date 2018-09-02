import java.nio.channels.NonWritableChannelException;

public class Attractie {
	
	String attractieNummer;
	
	String naam;
	double prijs;
	int oppervlakte;
	
	double attractieOmzet;
	double teBelastenOmzet;
	
	int aantalKaartjes;
	
	double kansSpelBelasting = 0;
	
	
	Attractie(String attractieNummer, String naam, double prijs, int oppervlakte) {
		this.attractieNummer = attractieNummer;
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}
	
	Attractie() {
		
	}
	
	void draaien() throws KeuringsException {
		System.out.println("Je komt van een koude kermis thuis.");
		System.out.println("Er is hier helemaal geen " + naam);
	}
	
	void kaartjeKopen() {
		attractieOmzet += prijs;
		teBelastenOmzet += prijs;
		Kassa.omzet += prijs;
		Kassa.omzetNaBelasting += prijs;
		
		aantalKaartjes++;
		Kassa.totaalKaartjes++;
		
		try 
		{
			draaien();
		} 
		catch (KeuringsException e) 
		{
			System.out.println("Exception");
		} 
		catch (Exception e) 
		{
			
		}
		
	}
	
}






class KeuringsException extends Exception {}



interface GokAttractie {
	
	double belastingTarief = 0.3;
	
	static double kansspelbelastingBetalen(Attractie attractie) {
		double belasting = attractie.teBelastenOmzet*belastingTarief;
		attractie.teBelastenOmzet = 0;
		return belasting;
		
	}
}





