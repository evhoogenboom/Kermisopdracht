import java.util.Scanner;


public class Attractie {
	
	Scanner sc = new Scanner(System.in);
	
	String naam;
	double prijs;
	int oppervlakte;
	
	double attractieOmzet;
	double teBelastenOmzet;
	
	int aantalKaartjes;
	
	
	
	
	Attractie(String naam, double prijs, int oppervlakte) {
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
	
	
	double kaartjeKopen() {
		attractieOmzet += prijs;
		teBelastenOmzet += prijs;
		Kassa.omzet += prijs;
		Kassa.setOmzetNaBelasting(prijs);
		
		aantalKaartjes++;
		Kassa.totaalKaartjes++;
		
		try 
		{
			draaien();
		} 
		catch (KeuringsException e) 
		{
			System.out.println("hier gaat iets mis");
		} 
		catch (Exception e) 
		{
			
		}
		return prijs;
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





