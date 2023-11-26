public class Mathematique {
	static double f(double x, double n) throws NegatifException {
//		if (n==0 ) {
//			throw new ArithmeticException("impossible de faire une division par zero !");
		//-------------------------------------------------------------------
	   if (n == -3) {
	      throw new NegatifException();
	   }
	   return Math.sqrt(x) / n;
	}

    public static void main(String args[]) {
//      try {
//      double n = Double.parseDouble(args[0]);
//      double x = Double.parseDouble(args[1]);
//      System.out.println(f(n, x));
//  	} catch (ArrayIndexOutOfBoundsException e) {
//      	System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ca fonctionne");
//  }
    	//------------------------------------------------------------------- 	       
//    	try {
//    		double n = Double.parseDouble(args[0]);
//    		double x = Double.parseDouble(args[1]);
//    		System.out.println(f(n, x));
//    	} catch (NumberFormatException e) {
//    		System.out.println("Les arguments doivent etre des nombres");
//    	}
//    	finally{
//    		System.out.println();
//    	}
//
//    	System.out.println("------- fin du programme ---------");
//    }
    	//-------------------------------------------------------------------
//    	try {
//		double x = Double.parseDouble(args[0]);
//		double n = Double.parseDouble(args[1]);
//		System.out.println(f(x, n));
//	} catch (ArithmeticException e) {
//		e.printStackTrace();
//	}
//	finally{
//		System.out.println("---finally---");
//	}
//
//	System.out.println("------- fin du programme ---------");
//}
    	//-------------------------------------------------------------------
    	try {
    		double x = Double.parseDouble(args[0]);
    		double n = Double.parseDouble(args[1]);
    		System.out.println(f(x, n));
    	} catch (NumberFormatException e) {
    		System.out.println("Les arguments doivent être des nombres");
    	} catch (NegatifException e) {
    		System.out.println(e.getMessage());
    	} finally {
    		System.out.println("-----finally----");
    	}

    	System.out.println("------- fin du programme ---------");
    }   	
}

class NegatifException extends Exception {
	NegatifException() {
        super("-3 est negatif : on ne peut pas calculer une racine pour un reel negatif !!!!!!");
	}
}

//public class Mathematique {
//	static double f(double x, double n) throws ParametreNullException {
//	   if (n == 0) {
//	      throw new ParametreNullException();
//	   }
//	   return Math.sqrt(x) / n;
//	}
//
//    public static void main(String args[]) {
//
//    	try {
//    		double x = Double.parseDouble(args[0]);
//    		double n = Double.parseDouble(args[1]);
//    		System.out.println(f(x, n));
//    	} catch (NumberFormatException e) {
//    		System.out.println("Les arguments doivent être des nombres");
//    	} catch (ParametreNullException e) {
//    		System.out.println(e.getMessage());
//    	} finally {
//    		System.out.println("-----finally----");
//    	}
//
//    	System.out.println("------- fin du programme ---------");
//    }   	
//}
//
//class ParametreNullException extends Exception {
//	ParametreNullException() {
//        super("Impossible de faire une division par zero !");
//	}
//}

//public class Mathematique {
//	static double f(double x, double n) throws NegatifException {
//	   if (n == -3) {
//	      throw new NegatifException();
//	   }
//	   return Math.sqrt(x) / n;
//	}
//
//    public static void main(String args[]) {
//
//    	try {
//    		double x = Double.parseDouble(args[0]);
//    		double n = Double.parseDouble(args[1]);
//    		System.out.println(f(x, n));
//    	} catch (NumberFormatException e) {
//    		System.out.println("Les arguments doivent être des nombres");
//    	} catch (NegatifException e) {
//    		System.out.println(e.getMessage());
//    	} finally {
//    		System.out.println("-----finally----");
//    	}
//
//    	System.out.println("------- fin du programme ---------");
//    }   	
//}
//
//class NegatifException extends Exception {
//	NegatifException() {
//        super("-3 est negatif : on ne peut pas calculer une racine pour un reel negatif !!!!!!");
//	}
//}