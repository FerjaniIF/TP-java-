public class Point {
	 protected int abs;
	 protected int ord;
	 protected char nom;
	 
	 public void afficher() {
		 System.out.println(nom+"("+abs+","+ord+")");
	 }
	 
	 public void deplacer(int x, int y) {
		 abs += x;
		 ord += y;
	 }
	 
	 public void reset(Point p) {
		 p.abs = 0;
		 p.ord = 0;
	 }
	 
	 public Point(char nom, int abs, int ord) {
		 this.nom = nom;
		 this.abs = abs;
		 this.ord = ord ; 
	 }
	 
	 public Point() {
		 nom = 'O';
		 abs = 0;
		 ord = 0;
	 }
	 
	 public Point(Point p) {
		 this.nom = p.nom;
		 this.abs = p.abs;
		 this.ord = p.ord;
	 }
	 
	 @Override
	 public String toString() {
		 return "point "+nom+'('+abs+','+ord+')';
	 }
	 
	 public boolean coincide_v1(Point p) {
		 return (this.nom == p.nom && this.abs == p.abs && this.ord == p.ord);
	 }
	 
	 public static boolean coincide_v2(Point p, Point p1) {
		 return (p1.nom == p.nom && p1.abs == p.abs && p1.ord == p.ord);
	 }
	 
	public static void main(String[] args) {
		Point p = new Point();
		p.afficher();
		
		p.deplacer(1, 2);
		p.afficher();
		
		p.reset(p);
		p.afficher();
	}
}
