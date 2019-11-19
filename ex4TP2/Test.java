package ex4TP2;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList<Voiture> ls = new ArrayList<Voiture>() ;
		Voiture v1 = new Voiture(1);
		Voiture v2 = new Voiture(2);
		ls.add(v1);
		ls.add(v2);
		Parking p = new Parking(5,ls);
		System.out.println("la vliste des voitures");
		p.AfficherListeVoitures();
	}

}
