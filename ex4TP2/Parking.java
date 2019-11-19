package ex4TP2;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	private static int NbPlaces;
	private static List<Voiture> voitures;
	public Parking(int nb, ArrayList<Voiture> ls) {
		NbPlaces = nb;
		voitures = ls;
	}
	public boolean Enter(){
		if (voitures.size()<NbPlaces)
		return true;
		return false;
	}

	public void Quitter(){
		System.out.println("la voiture sort");
	}

	public void AfficherListeVoitures(){
		for(int i=0; i<voitures.size(); i++){
			System.out.println("la voiture "+i);
			voitures.get(i).toString();
		}

	}

}