package ProjetUml.entities;

import java.util.ArrayList;
import java.util.List;

public class Niveau {

	
	int valeurDebut;
	int valeurFin;
	List<Integer>listeNiveau= new ArrayList<Integer>();
	
	public Niveau(int valeurDebut, int valeurFin) {
		
		super();
		List<Integer>listeNiveau= new ArrayList<Integer>();
		this.valeurDebut = valeurDebut;
		this.valeurFin = valeurFin;
		
		for(int i=valeurDebut;i<=valeurFin;i++){
			
			listeNiveau.add(i);
		}
		this.listeNiveau=listeNiveau;
	}

	public int getValeurDebut() {
		return valeurDebut;
	}

	public void setValeurDebut(int valeurDebut) {
		this.valeurDebut = valeurDebut;
	}

	public int getValeurFin() {
		return valeurFin;
	}

	public void setValeurFin(int valeurFin) {
		this.valeurFin = valeurFin;
	}

	public List<Integer> getListeNiveau() {
		return listeNiveau;
	}
	
	
	
	
	
	
	
	
	
}
