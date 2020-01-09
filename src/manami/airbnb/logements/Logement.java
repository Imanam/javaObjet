package manami.airbnb.logements;
import manami.airbnb.utilisateurs.*;

public class Logement {

	private Personne personne;
	private int tarifParNuit;
	private String adresse;
	private int superficie;
	private int nbVoyageursMax;
	
	public Logement(Personne paramPersonne, int paramTarif, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax) {
		personne = paramPersonne;
		tarifParNuit = paramTarif;
		adresse = paramAdresse;
		superficie = paramSuperficie;
		nbVoyageursMax = paramNbVoyageursMax;		
	}
	
	public int getTarifParNuit() {
		return tarifParNuit;
	}
	
	public void afficher() {
		personne.afficher();
		System.out.println("Le logement est situé " +  adresse);
		System.out.println("Superficie :  " +   superficie);
	}

}

