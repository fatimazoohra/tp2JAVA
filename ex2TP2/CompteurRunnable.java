// package ex2TP2;

public class CompteurRunnable implements Runnable {

	int maxValue;
	String nom;
	CompteurRunnable(String n,int maxVal){
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
