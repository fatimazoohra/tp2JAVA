public class Simulation{
	public static void main(String [] args ){
		Parking p = new Parking(4);
		Voiture v1 = new Voiture(154,p);
		Voiture v2 = new Voiture(798,p);
		Voiture v3 = new Voiture(231,p);
		Voiture v4 = new Voiture(897,p);
		Voiture v5 = new Voiture(548,p);
		Voiture v6 = new Voiture(223,p);
		// p.voitures.add(v1);
		// p.voitures.add(v2);
		// System.out.println(p.voitures.size());
		// p.AfficherListeVoitures();
		// System.out.println(v1.toString());
		// System.out.println(v2.toString());
		v1.start();
		v2.start();
		v3.start();
		v4.start();
		v5.start();
		v6.start();
		// System.out.println(p.voitures.size());
		// p.AfficherListeVoitures();
	}
}