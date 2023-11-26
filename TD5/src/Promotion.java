import java.time.LocalDate;
public interface Promotion {

	final LocalDate debutPromo = LocalDate.of(2022, 3, 19);
    final LocalDate finPromo = LocalDate.of(2022, 3, 31);
	
	abstract double prixDeVente(String dateStr);
	
	default boolean estPeriodePromo(String dateStr) {
		LocalDate date = LocalDate.parse(dateStr);
		
		if (date.isAfter(debutPromo) && date.isBefore(finPromo))
			return true;
		return false;
	}
	
	public static double calculerRemise(double prixAvantRemise, double prixApresRemise) {
		double remise;
		return remise = ((prixAvantRemise - prixApresRemise)/prixAvantRemise)*100; 
	}
}
