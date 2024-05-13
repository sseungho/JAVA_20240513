package java_ch05_20240513;

public class EnnumTest {
	public enum Bands {METALLICA, NIRVANA, PEARLJAM, GREENDAY, SLAYER, PANTERA, HELMET}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bands metal;
		metal = Bands.SLAYER;
		
		Bands rock;
		rock = Bands.GREENDAY;
		
		System.out.print(rock);
	}

}
