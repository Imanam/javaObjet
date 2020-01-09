package manami.airbnb.reservations;
import java.text.SimpleDateFormat;
import java.util.Date;
import manami.airbnb.logements.Logement;

public class Sejour {
	
	private Date dateArrivee;
	private int nbNuits;
	private Logement logement;
	private int nbVoyageurs​;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public Sejour(Date pDateArrivee, int pNbNuits, Logement pLogement, int pNbVoyageurs) {
		
		dateArrivee = pDateArrivee;
		nbNuits = pNbNuits;
		logement = pLogement;
		nbVoyageurs​ = pNbVoyageurs;
		
	}

	public void afficher() {
		int prixTotal;
		String dateString;
		logement.afficher();
		
		
		dateString = dateFormat.format(dateArrivee);
		prixTotal = nbNuits * logement.getTarifParNuit();
		System.out.println("La date d'arrivée est le " + dateString + " pour "+ nbNuits + " nuits.");
		System.out.println("Le prix de ce séjour est de " + prixTotal + ".");
	}
	
}
