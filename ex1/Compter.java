package TP2;

public class Compter implements Runnable{
	
	int direction;
	int max = 1000;
	String nom;
	
	Compter(String nm,int direction){
		nom=nm;
		this.direction = direction;
	}
	
	public void run() {
		
			for(int i=1;i<=max; i++) {
				System.out.println(nom+':'+((max+1)*( (1-direction)/2 )+direction*i));
			}
	}
	public static void main(String[] args) {
		Runnable Compter1= new Compter("t1",1);
		new Thread(Compter1).start();
		
		Runnable Compter2= new Compter("t2",-1);
		new Thread(Compter2).start();
		
	}

}
