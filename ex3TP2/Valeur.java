package ex3TP2;

public class Valeur  {
	int valeur;
	
	Valeur(int val){
		this.valeur=val;
	}
	
	public int getVal() {
		return this.valeur;
	}
	public synchronized void add(int i) {
		valeur+=i;
	}
	public String toString() {
		return "la valeur est : "+this.valeur;
	}

	
}
