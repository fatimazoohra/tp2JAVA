// package ex2TP2;

public class TestOrder {

	public static void main(String[] args) {
		//for Thread :
		// new Compteur("T1",10).start();
		// new Compteur("T2",20).start();
		//for Runnable :
		Runnable c1 = new Compteur("r1",10);
		Runnable c2 = new Compteur("r2",10);
		new Thread(c1).start();
		new Thread(c2).start();
	 }
}

// ''''''''''''''''''''''''''''''''''''''''it works in both ways (for Thread))'''''''''''''''''''''''''''''''''''''''''
// 		Thread c1 = new Compteur("T1",10);
// 		c1.start();
// 		Thread c2 = new Compteur("T2",20);
// 		c2.start();