package ProjetUml.entities;

public enum Garantie {

	
	Habitat ("Habitat"),
	Prevoyance("Prévoyance"),
	Sante("Santé"),
	Voiture("Voiture");
	
	private String nom;
	
	Garantie(String nom){
		
		this.nom=nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	
	
}
