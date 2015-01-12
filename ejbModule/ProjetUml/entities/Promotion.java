package ProjetUml.entities;

import java.util.Date;

public class Promotion {
	
	String idPromotion;
	String description;
	Date dateDebut;
	int duree;
	Garantie typePromotion;
	
	public Promotion() {
		super();
	
	}

	public String getIdPromotion() {
		return idPromotion;
	}

	public void setIdPromotion(String idPromotion) {
		this.idPromotion = idPromotion;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Garantie getTypePromotion() {
		return typePromotion;
	}

	public void setTypePromotion(Garantie typePromotion) {
		this.typePromotion = typePromotion;
	}
	
	

}
