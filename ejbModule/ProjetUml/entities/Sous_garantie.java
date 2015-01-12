package ProjetUml.entities;

import java.util.HashSet;
import java.util.Set;

public class Sous_garantie {
	
	
	String codeSousGarantie ;
	Float capitalAssure;
	Float Franchise;
	Float tauxRemboursement;
	Garantie typeGarantie;
	Niveau niveau;
	
	Set<Sinistre>listeSinistre=new HashSet<Sinistre>();

	public Sous_garantie() {
		super();
	}

	public String getCodeSousGarantie() {
		return codeSousGarantie;
	}

	public void setCodeSousGarantie(String codeSousGarantie) {
		this.codeSousGarantie = codeSousGarantie;
	}

	public Float getCapitalAssure() {
		return capitalAssure;
	}

	public void setCapitalAssure(Float capitalAssure) {
		this.capitalAssure = capitalAssure;
	}

	public Float getFranchise() {
		return Franchise;
	}

	public void setFranchise(Float franchise) {
		Franchise = franchise;
	}

	public Float getTauxRemboursement() {
		return tauxRemboursement;
	}

	public void setTauxRemboursement(Float tauxRemboursement) {
		this.tauxRemboursement = tauxRemboursement;
	}

	public Garantie getTypeGarantie() {
		return typeGarantie;
	}

	public void setTypeGarantie(Garantie typeGarantie) {
		this.typeGarantie = typeGarantie;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public Set<Sinistre> getListeSinistre() {
		return listeSinistre;
	}

	public void setListeSinistre(Set<Sinistre> listeSinistre) {
		this.listeSinistre = listeSinistre;
	}
	
	
	
	
	
	
	
	
	

}
