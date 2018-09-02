
public class Kassa {
	
	static int totaalKaartjes;
	static double omzet;
	private static double omzetNaBelasting;
	static int belastingInspecties;
	
	static void update(double omzetBelasting) {
		omzetNaBelasting -= omzetBelasting;
		belastingInspecties++;
	}
	
	
	public static double getOmzetNaBelasting() {
		return omzetNaBelasting;
	}
	
	
	public static void setOmzetNaBelasting(double prijs) {
		omzetNaBelasting -= prijs;
	}
	
}
