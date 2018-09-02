
public abstract class RisicoRijkeAttractie extends Attractie {
	
	int draaiLimiet;
	boolean keuringNogGeldig; // als ik hier opstellingskeuring al aanroep wordt de null gekeurd;
	
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

}