import java.util.Scanner;

public class Kermis {
	final static int aantalAttracties = 7;
	static double zakgeld = 60;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Kermis kermis = new Kermis();
		
		Attractie botsautos = new Botsautos("1", "Botsauto's", 2.50, 0);		
		Attractie spin = new Spin("2", "Spin", 2.25, 0);
		Attractie spiegelpalijs = new Spiegelpalijs("2", "Spiegelpalijs", 2.25, 0);
		Attractie spookhuis = new Spookhuis("2", "Spookhuis", 2.25, 0);
		Attractie hawaii = new Hawaii("5", "Hawaii", 2.90, 0);
		Attractie ladderKlimmen = new LadderKlimmen("6", "Ladderklimmen", 5., 0);
		Attractie hollandscheGebakkraam = new Attractie("2", "Hollandsche Gebakkraam", 2.25, 0);
		
		Attractie[] attracties = 
			{botsautos, spin, spiegelpalijs, spookhuis, hawaii, ladderKlimmen, hollandscheGebakkraam};
		
		for (int i=0; i<5; i++) { // om te testen, wordt later while of do while
			kermis.naarDeKermis(attracties);
		}
		
		do {
			kermis.naarDeKermis(attracties);
		} while (zakgeld >= 5);
		System.out.println("Tijd om naar huis te gaan.");
	}
	
	
	
	void naarDeKermis(Attractie[] attracties) {
		String stringInvoer = vraagInvoer();
		char invoer = stringInvoer.charAt(0);
		switch (invoer) {
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
			zakgeld -= attracties[Integer.parseInt(stringInvoer)-1].kaartjeKopen();
			break;
		case 'o': 
			System.out.println(Kassa.getOmzetNaBelasting());
			break;
		case 'k':
			System.out.println(Kassa.totaalKaartjes);
			break;
		case 'b':
			Belastinginspecteur.langskomen(attracties);
			break;
		}
	}
	
	
	
	String vraagInvoer() {
		System.out.println("Maak uw keuze (attractienr 1-7, 'o', 'k' of 'b'");
		String invoer = sc.nextLine();
		if (invoer.length() != 1) {
			System.out.println("verkeerde invoer");
			invoer = vraagInvoer();
		}
		return invoer;
	}
	
	
	
}
