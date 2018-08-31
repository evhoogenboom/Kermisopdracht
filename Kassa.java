
public class Kassa {
	static double omzet;
	static double omzetNaBelasting;
	
	static int totaalKaartjes;
	
	static int belastingInspecties;
	
	static void update(double omzetBelasting) {
		omzetNaBelasting -= omzetBelasting;
		belastingInspecties++;
	}
}
