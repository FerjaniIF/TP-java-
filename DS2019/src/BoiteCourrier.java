public class BoiteCourrier {
		
		public Courrier[] t;
		private int inv;
		
		public BoiteCourrier(int n) {
			this.t= new Courrier[n];			
		}
		
		public double affranchir() {
			double tot = 0.0;
			for (int i=0; i<t.length;i++) {
				if (!(t[i] == null))
					tot+= t[i].affranchir();
			}
			return tot; 
		}
		
		public int courriersInvalides() {

		        for (int i = 0; i < t.length; i++) {
		        	if (!(t[i] == null)) {
		        		if (!t[i].estValide()) {
		        			inv++;
		        		}
		        	}
		        }
		        return inv;  
		}
		
		public void afficher() {
			for(int i=0;i<t.length;i++) {
				if (!(t[i] == null)) {
					this.t[i].decrire();
					if (!t[i].estValide()) 
						System.out.println("Ce courrier est invalide.");   
				}
			}
		}
		
		public void ajoutCourrier(Courrier c) {
			int i =0;
		    if (i < t.length) {
		        t[i] = c;
		        i++;
		    }
		}



}

