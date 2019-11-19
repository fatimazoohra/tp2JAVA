package ex2TP2;

public class Compteur extends Thread {

	int maxValue;
	String nom;
	Compteur(String n,int maxVal){
		maxValue=maxVal;
		nom=n;
	}
	
	public void  run() {
		try {
			int random= (int) (Math.random()*1000);
			for(int i=0;i<=maxValue;i++) {
				System.out.println(nom+" "+i+" ");
				//sleep(100);		
				sleep(random);
				System.out.println(random);
			}
		}catch(InterruptedException e) {
				return;
			}
	}
}
