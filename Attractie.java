import java.util.Scanner;


public class Attractie {
	
	Scanner sc = new Scanner(System.in);
	
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
			vraagMonteur();
			System.out.println("De monteur is langsgeweest");
		} 
		catch (Exception e) 
		{
			
		}
		return prijs;
	}
	
	
	void vraagMonteur() {
		System.out.println("Draailimiet bereikt, toets 'm' om de monteur te halen");
		String invoer = sc.nextLine();
		if (!invoer.equals("m")) {
			System.out.println("verkeerde invoer");
			//vraagMonteur();
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





