package ProjetUml.entities;

import java.util.HashSet;
import java.util.Set;

public class RedacteurTechnique extends Personne {

	Set<Contrat>listeContrat=new HashSet<Contrat>();

	public RedacteurTechnique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<Contrat> getListeContrat() {
		return listeContrat;
	}

	public void setListeContrat(Set<Contrat> listeContrat) {
		this.listeContrat = listeContrat;
	}
	
	
}
