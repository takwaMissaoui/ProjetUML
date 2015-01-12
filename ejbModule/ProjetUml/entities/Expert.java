package ProjetUml.entities;

import java.util.HashSet;
import java.util.Set;

public class Expert extends Personne {
	
Set<Sinistre>listeSinistre = new HashSet<Sinistre>();

public Expert() {
	super();
	// TODO Auto-generated constructor stub
}

public Set<Sinistre> getListeSinistre() {
	return listeSinistre;
}

public void setListeSinistre(Set<Sinistre> listeSinistre) {
	this.listeSinistre = listeSinistre;
}	



}
