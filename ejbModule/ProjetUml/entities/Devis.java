package ProjetUml.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Devis {

	String idContrat;
	Date dateDebut;
	int duree;
	
	Set<Sous_garantie> liste_sousgaranties=new HashSet<Sous_garantie>();

	public Devis() {
		
	}

	public String getIdContrat() {
		return idContrat;
	}

	public void setIdContrat(String idContrat) {
		this.idContrat = idContrat;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Set<Sous_garantie> getListe_sousgaranties() {
		return liste_sousgaranties;
	}

	public void setListe_sousgaranties(Set<Sous_garantie> liste_sousgaranties) {
		this.liste_sousgaranties = liste_sousgaranties;
	}
	
	
	
}
