package ProjetUml.entities;

import java.util.Date;

public class Cheque {

	String codeCheque;
	Date dateCheque;
	Float montantRemboursement;
	public Cheque() {
		super();
		
	}
	public String getCodeCheque() {
		return codeCheque;
	}
	public void setCodeCheque(String codeCheque) {
		this.codeCheque = codeCheque;
	}
	public Date getDateCheque() {
		return dateCheque;
	}
	public void setDateCheque(Date dateCheque) {
		this.dateCheque = dateCheque;
	}
	public Float getMontantRemboursement() {
		return montantRemboursement;
	}
	public void setMontantRemboursement(Float montantRemboursement) {
		this.montantRemboursement = montantRemboursement;
	}
	
	
	
}
