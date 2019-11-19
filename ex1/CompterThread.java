package TP2;

public class CompterThread extends Thread {

		int direction;
		int max = 1000;
		String nom;
		
		CompterThread (String nm,int direction){
			nom=nm;
			this.direction = direction;
		}
		
		public void run() { 
				for(int i=1;i<=max; i++) {
					System.out.println(nom+':'+((max+1)*( (1-direction)/2 )+direction*i));
				}
		}
		public static void main(String[] args) {
			
			new CompterThread("t1",1).start();
			new CompterThread("t2",-1).start();
		}

	}


