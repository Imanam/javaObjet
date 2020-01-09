package manami.airbnb;
import manami.airbnb.utilisateurs.Personne;

import java.text.SimpleDateFormat;
import java.util.Date;

import manami.airbnb.logements.Logement;
import manami.airbnb.reservations.Sejour;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne1;
						
		//2. Initialisation Maxime Albert (28 ans)
		personne1 = new Personne("Maxim", "Albert", 28);
		
		//3. Utilisation
		//personne1.afficher();
		
		Logement logement1;
		logement1 = new Logement(personne1, 128, "12avenue de Marcel Dassault 37200", 140, 5);
		//logement1.afficher();
		
		
		Sejour sejour1;
		sejour1 = new Sejour(new Date(), 4, logement1, 3);
		sejour1.afficher();
	}

}
