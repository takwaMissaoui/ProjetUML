package ProjetUml.entities;

import java.util.HashSet;
import java.util.Set;

public class Courtier extends Personne {

	Float commission;
	Set<Contrat>listeContrat=new HashSet<Contrat>();
	
	

	public Courtier() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Float getCommission() {
		return commission;
	}



	public void setCommission(Float commission) {
		this.commission = commission;
	}



	public Set<Contrat> getListeContrat() {
		return listeContrat;
	}



	public void setListeContrat(Set<Contrat> listeContrat) {
		this.listeContrat = listeContrat;
	}
	
	
	
}
