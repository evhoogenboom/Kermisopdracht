
public class Belastinginspecteur {
	
	static double totaalOpgehaaldeBelasting;
	
	static void langskomen(Attractie[] attracties) {
		for (Attractie attractie : attracties) {
			if (attractie instanceof GokAttractie) {
				double belasting = GokAttractie.kansspelbelastingBetalen(attractie);
				totaalOpgehaaldeBelasting += belasting;
				Kassa.update(belasting);
				System.out.println("De belastinginspecteur is langsgeweest bij " + attractie.naam);
			}
		}

	}
}
