// package TP2;

public class CompterWithoutThread {

		int direction;
		int max = 20;
		String nom;
		
		CompterWithoutThread (String nm,int direction){
			nom = nm;
			this.direction = direction;
		}
		
		public void run() { 
				for(int i=1;i<=max; i++) {
					System.out.println(nom+':'+((max+1)*( (1-direction)/2 )+direction*i));
				}
		}
		public static void main(String[] args) {
			
			new CompterWithoutThread("t1",1).run();
			new CompterWithoutThread("t2",-1).run();
		}

	}


