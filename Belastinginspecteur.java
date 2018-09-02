
public class Belastinginspecteur {
	
	static double opgehaaldeBelasting;
	
	static void langskomen(Attractie[] attracties) {
		for (Attractie attractie : attracties) {
			if (attractie instanceof GokAttractie) {
				opgehaaldeBelasting += GokAttractie.kansspelbelastingBetalen(attractie);
				Kassa.update(opgehaaldeBelasting);
				System.out.println("De belastinginspecteur is langsgeweest bij " + attractie.naam);
			}
		}

	}
}
