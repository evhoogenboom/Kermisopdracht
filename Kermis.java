import java.util.Scanner;

public class Kermis {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Kermis kermis = new Kermis();
		
		Attractie botsautos = new Botsautos("1", "Botsauto's", 2.50, 0);		
		Attractie spin = new Spin("2", "Spin", 2.25, 0);
		Attractie hawaii = new Hawaii("5", "Hawaii", 2.90, 0);
		Attractie ladderKlimmen = new LadderKlimmen("6", "Ladderklimmen", 5., 0);
		
		Attractie[] attracties = {botsautos, spin, hawaii, ladderKlimmen};
		
		for (int i=0; i<20; i++) {
			int number = Integer.parseInt(kermis.vraagInvoer());
			if (number > 0 && number <= attracties.length) 
				attracties[number-1].kaartjeKopen();
			
		}
		
		
		System.out.println(Kassa.omzet);
		System.out.println();
		System.out.println(Kassa.totaalKaartjes);
	
		Belastinginspecteur b = new Belastinginspecteur();
		b.langskomen(attracties);
		System.out.println(Kassa.omzetNaBelasting);
		System.out.println(Kassa.belastingInspecties);
	}
	
	
	String vraagInvoer() {
		System.out.println("Kies een nummer");
		return sc.nextLine();
		
	}
	
	
	
}
