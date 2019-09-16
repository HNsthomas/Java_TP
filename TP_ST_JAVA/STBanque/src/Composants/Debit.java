package Composants;


import java.time.LocalDateTime;

public class Debit extends Flux {
	
	public Debit(String commentaire, int identifiant, double montant, int numeroCompteCible, 
			boolean effectue, LocalDateTime dateDuFlux) {
		
		super(commentaire, identifiant, montant, numeroCompteCible, effectue, dateDuFlux);
		
	}
	
	public int getNumeroCompteEmetteur() {
		return 0;
	}
	
}
