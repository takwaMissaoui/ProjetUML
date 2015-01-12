package ProjetUml.entities;

import java.util.HashSet;
import java.util.Set;

public class ChefComptable extends Personne {
	
	Set<Cheque>listeCheque=new HashSet<Cheque>();

	public ChefComptable() {
		super();
		
	}

	public Set<Cheque> getListeCheque() {
		return listeCheque;
	}

	public void setListeCheque(Set<Cheque> listeCheque) {
		this.listeCheque = listeCheque;
	}
	
	
	

}
