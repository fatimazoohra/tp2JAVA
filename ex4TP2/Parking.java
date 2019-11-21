
import java.util.ArrayList;

public class Parking {
	private static int NbPlaces;
	public ArrayList<Voiture> voitures;

	public Parking(int nb){
		this.NbPlaces = nb;
		voitures = new ArrayList<Voiture>();
	}
	public boolean enter(Voiture v){
		boolean b = false;
		if (voitures.size()<NbPlaces){
			b = true;
			voitures.add(v);
		}
		// System.out.println(voitures.size());
		return b;
	}

	public void quitter(Voiture v){
		voitures.remove(v);
		System.out.println("la voiture "+v.id+" est sortie.");
	}

	public void AfficherListeVoitures(){
		for(int i=0; i<voitures.size(); i++){
			System.out.println("Voiture "+(i+1)+" :"+voitures.get(i).toString());
		}

	}

}