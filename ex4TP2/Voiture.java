package ex4TP2;

public class Voiture extends Thread{
	private int id;
	public Voiture(int id){
		this.id = id;
	}
	public String toString(){
		return "la voiture "+id;

	}

}