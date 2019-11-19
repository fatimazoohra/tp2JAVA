package ex3TP2;

import TP2.Compter;

public class Test {

	public static void main(String[] args) {
		Valeur MyVal=new Valeur(0);
		
		Runnable Ajob1= new Ajob(MyVal,1);
		Thread t1 = new Thread(Ajob1);
		
		
		Runnable Ajob2= new Ajob(MyVal,-1);
		Thread t2 = new Thread(Ajob2);
		t1.start();
		t2.start();
			System.out.println(t1.isAlive());
		if(t1.isAlive()==false && t2.isAlive()==false ) {
			System.out.println("La valeur final est "+MyVal.toString());
		}
	}

}
