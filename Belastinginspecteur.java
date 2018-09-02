
public class Belastinginspecteur {
	
	static double opgehaaldeBelasting;
	
	static void langskomen(Attractie[] attracties) {
		Attractie attractie = attracties[3];
		opgehaaldeBelasting += GokAttractie.kansspelbelastingBetalen(attractie);
		Kassa.update(opgehaaldeBelasting);
	}
}
