package Logiciel;

import java.util.*;
import java.util.Set;
import java.util.List;

public class Etudiant extends Personne {

	private static int NumEtu = 01;
	public String Ann�e;
	public Set<String> Cours;
	public List<Integer> Notes;
	Matiere matieres;

	// constructeur
	public Etudiant(String nom, String prenom, int age, String Ann�e, Set<String> Cours,
			List<Integer> Notes,
			Matiere matieres) {

		super(nom, prenom, age);
		this.NumEtu++;
		this.Ann�e = Ann�e;
		this.Cours = Cours;
		this.Notes = Notes;
		this.matieres = matieres;

	}

	// Debut de Partie Setters/getters
	public int getNumEtu() {
		return NumEtu;
	}

	public void setNumEtu(int numEtu) {
		NumEtu = numEtu;
	}

	public String getAnn�e() {
		return Ann�e;
	}

	public void setAnn�e(String ann�e) {
		Ann�e = ann�e;
	}

	public Set<String> getCours() {
		return Cours;
	}

	public void setCours(Set<String> cours) {
		Cours = cours;
	}

	public List<Integer> getNotes() {
		return Notes;
	}

	public void setNotes(List<Integer> notes) {
		Notes = notes;
	}

	public void AjouterCours(String Cours) {

	}

	public void CalculerMoyenne(int Notes) {

	}

	// Fin de Partie Setters/getters

	// Patie Fonctions:

	protected double calculerMoyenne(List<Integer> Notes) {
		double moyenne;
		int somme = 0;
		int nbNotes = Notes.size();
		// cette boucle parcoures tout la liste des notes et elle additionne la somme de
		// toutes les notes
		for (int i : Notes) {
			somme = somme + i;
		}

		moyenne = somme / nbNotes;
		System.out.println("La moyenne calcul� est:\n " + moyenne);
		return moyenne;
		/*
		 * A propos de cette fonction: cette fonction retourne un nombre r�el mais
		 * l'affiche aussi
		 */
	}

	// Voici la fonction Ajouter cours

	protected void ajouterCours(String nomCour) {
		Cours.add(nomCour); // on ajoute le nom du cours a la liste des mati�res
		System.out.println("Cours " + nomCour + " Ajout� a la liste des cours de l'etudiant \n" 
		+ nom + " " + prenom); 
		// ce message nous notifie que la mati�re a �t� ajout� a la liste de cours d'un des etudiants
																													
	}
}
