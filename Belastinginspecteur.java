
public class Belastinginspecteur {
	
	double opgehaaldeBelasting;
	
	void langskomen(Attractie[] attracties) {
		Attractie attractie = attracties[0];
		opgehaaldeBelasting += GokAttractie.kansspelbelastingBetalen(attractie);
		Kassa.update(opgehaaldeBelasting);
	}
}
