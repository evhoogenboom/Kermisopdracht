
public class Belastinginspecteur {
	
	double opgehaaldeBelasting;
	
	void langskomen(Attractie[] attracties) {
		Attractie attractie = attracties[3];
		opgehaaldeBelasting += GokAttractie.kansspelbelastingBetalen(attractie);
		Kassa.update(opgehaaldeBelasting);
	}
}
