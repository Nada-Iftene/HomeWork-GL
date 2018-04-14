package Logiciel;

public class Matiere {
	
	public String Intitulé;
	public int NbreHeure;
	
	public Matiere(String Intitulé,int NbreHeure) {
		this.Intitulé=Intitulé;
		this.NbreHeure=NbreHeure;
	}
	
	//partie setters et getters

	public String getIntitulé() {
		return Intitulé;
	}

	public void setIntitulé(String intitulé) {
		Intitulé = intitulé;
	}

	public int getNbreHeure() {
		return NbreHeure;
	}

	public void setNbreHeure(int nbreHeure) {
		NbreHeure = nbreHeure;
	}
	
	

}
