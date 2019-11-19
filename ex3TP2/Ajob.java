package ex3TP2;

public class Ajob implements Runnable {
	Valeur myVal;
	int i;
	
	Ajob(Valeur myValeur,int ii){
		this.myVal=myValeur;
		this.i=ii;
	}
	public void run() {
		for(int j=0; j<10;j++) {
			 myVal.add(i);
			 System.out.println(myVal.toString());
		}
		

	}
}
