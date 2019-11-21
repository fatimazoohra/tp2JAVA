public class Voiture extends Thread{
	public int id;
	public Parking p;

	public Voiture(int id, Parking p){
		this.id = id;
		this.p = p;
	}

	public String toString(){
		return "numero "+id;
	}

	public void run(){			
		demander_enter();
		try{
			if(demander_enter()==true){
				int random = 1000;
				sleep(random);
				quitterLeParking();
			}
		}catch(InterruptedException e) {
				return;
			}
	}
	public boolean demander_enter(){
		 return p.enter(this);
	}
	public void quitterLeParking(){
		p.quitter(this);
	}
}