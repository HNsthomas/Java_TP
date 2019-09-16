package Composants;


import java.time.LocalDateTime;

public class Credit extends Flux{
	
	public Credit(String commentaire, int identifiant, double montant, int numeroCompteCible, 
			boolean effectue, LocalDateTime dateDuFlux) {
		
		super(commentaire, identifiant, montant, numeroCompteCible, effectue, dateDuFlux);
	}
	
	public int getNumeroCompteEmetteur() {
		return 0;
	}
}
