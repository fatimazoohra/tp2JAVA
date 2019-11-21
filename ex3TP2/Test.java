// package ex3TP2;

// import TP2.Compter;

public class Test {

	public static void main(String[] args) {
		Valeur MyVal = new Valeur(2);
		
		Runnable Ajob1 = new Ajob(MyVal,1);
		Thread t1 = new Thread(Ajob1);
		
		
		Runnable Ajob2 = new Ajob(MyVal,-1);
		Thread t2 = new Thread(Ajob2);

		t1.start();
		t2.start();

		System.out.println(t1.isAlive());

		if(t1.isAlive()!=false && t2.isAlive()!=false ) {
		// la valeur du MyValue devra etre a la fin 2
			System.out.println("\"final value\" "+MyVal.toString());
		}
	}

}
