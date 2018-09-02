import java.util.Scanner;

public class Kermis {
	final static int aantalAttracties = 7;
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
			//int number = Integer.parseInt(kermis.vraagInvoer());
			kermis.naarDeKermis(attracties);
		}
	}
	
	
	void naarDeKermis(Attractie[] attracties) {
		String invoer = vraagInvoer();
		try 
		{
			int nummer = Integer.parseInt(invoer);
			while (nummer > aantalAttracties) {
				invoer = vraagInvoer();
				nummer = Integer.parseInt(invoer);
			}
			attracties[nummer-1].kaartjeKopen();
		} 
		catch (Exception e) 
		{
			char letter = invoer.charAt(0);
			System.out.println(letter);
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
