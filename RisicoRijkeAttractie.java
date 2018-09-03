
public abstract class RisicoRijkeAttractie extends Attractie {
	
	int draaiLimiet;
	boolean keuringNogGeldig; // als ik hier opstellingskeuring al aanroep wordt de null gekeurd;
	
	@Override
	double kaartjeKopen() {
		System.out.println("Pas op, dit is een risicorijke attractie!");
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
	
	
	 

	boolean keuringNogGeldig() {
		boolean result = false;
		if (draaiLimiet != 0 && (aantalKaartjes) % draaiLimiet != 0) {
			result = true;
		}
		return result;
	}
	
	
	boolean opstellingsKeuring() {
		System.out.println("De kermis heeft een " + naam + " en die is gekeurd.");
		return true;
	}

	
	
	void vraagMonteur() {
		System.out.println("Draailimiet bereikt, toets 'm' om de monteur te halen");
		String invoer = sc.nextLine();
		if (keuringNogGeldig || invoer.equals("m")) {
			keuringNogGeldig = true;
		} else {
			System.out.println("verkeerde invoer");
			vraagMonteur();
		}
	}
	
	
	
}