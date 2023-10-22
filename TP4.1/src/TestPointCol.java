
public class TestPointCol {

	public static void main(String[] args) {
		PointCol p1= new PointCol('A',2,0,"blue");
		PointCol p2= new PointCol('B',3,1,"rouge");

//		p.afficher();
		
//		p.deplacer(1,1);
//		p.setCouleur("rose");
//		p.afficher();
		
		Point p = new Point();
		p=p1;
		p.afficher();
		
		p=p2;
		p.afficher();
	
	}

}
