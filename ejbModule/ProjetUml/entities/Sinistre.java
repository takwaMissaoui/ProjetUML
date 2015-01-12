package ProjetUml.entities;

import java.util.Date;

public class Sinistre {

	String codeSinistre;
	Date datesSinistre;
	Float montantDommage;
	Cheque cheque;

	public Sinistre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCodeSinistre() {
		return codeSinistre;
	}

	public void setCodeSinistre(String codeSinistre) {
		this.codeSinistre = codeSinistre;
	}

	public Date getDatesSinistre() {
		return datesSinistre;
	}

	public void setDatesSinistre(Date datesSinistre) {
		this.datesSinistre = datesSinistre;
	}

	public Float getMontantDommage() {
		return montantDommage;
	}

	public void setMontantDommage(Float montantDommage) {
		this.montantDommage = montantDommage;
	}

	public Cheque getCheque() {
		return cheque;
	}

	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}
	
	
	
}
