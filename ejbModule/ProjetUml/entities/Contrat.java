package ProjetUml.entities;

import java.util.HashSet;
import java.util.Set;

public class Contrat extends Devis {
	
	Set<Facture> liste_factures=new HashSet<Facture>();

	public Contrat() {
		super();
	}

	public Set<Facture> getListe_factures() {
		return liste_factures;
	}

	public void setListe_factures(Set<Facture> liste_factures) {
		this.liste_factures = liste_factures;
	}
	
	

}
