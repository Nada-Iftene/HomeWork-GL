package Logiciel;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {

		// liste des notes
		ArrayList<Integer> liste = new ArrayList<Integer>();
		liste.add(18);
		liste.add(11);
		liste.add(15);
		liste.add(7);
		liste.add(10);


		Matiere m1=new Matiere("GL",50);
		Matiere m2=new Matiere("SE",60);
		Matiere m3=new Matiere("RC",50);
		Matiere m4=new Matiere("BDD",50);
		Matiere m5=new Matiere("ANGLAIS",50);
		Matiere m6=new Matiere("DEVWEB",50);
		Matiere m7=new Matiere("THG",50);
		Matiere m8=new Matiere("ASP",50);

		// partie de creation d'une liste de 4 cours
		HashSet<String> l2 = new HashSet<String>();
		// on prends comme exemple une variable l2, qui constitue de 4
		l2.add(m1.Intitulé);
		l2.add(m5.Intitulé);
		l2.add(m8.Intitulé);
		l2.add(m2.Intitulé);

		// partie creation des etudiants
		Etudiant e1 = new Etudiant("Ahmed", "Bahmani", 20, "1998", l2, liste, m1);
		Etudiant e2 = new Etudiant("Fortas", "Oussama", 19, "1999", l2, liste, m1);
		Etudiant e3 = new Etudiant("Belhadj", "Amine", 21, "1997", l2, liste, m1);
		Etudiant e4 = new Etudiant("Bekhoucha", "Djawed", 19, "1999", l2, liste, m1);
		Etudiant e5 = new Etudiant("Ahmed", "Bahmani", 22, "1996", l2, liste, m1);
		// ici on assume que tous les etudiants partages la meme liste des matiéres (qui
		// est dans notre exemple la variable deuxieme_année) et il partagent aussi la
		// meme liste de notes (ce n'est qu'un test)
		// Ici on teste la fonction qui calcule la moyenne, comme exemple on prends le
		// premier etudiant
		// cette fonction fait a deux options : elle affiche la moyenne avec la
		// posibilité de la stocker dans une variable

		// exemple affichage 
		System.out.println("Exemple affichage  : ");
		e1.calculerMoyenne(e1.Notes);
		e2.calculerMoyenne(e2.Notes);
		e3.calculerMoyenne(e3.Notes);
		e4.calculerMoyenne(e4.Notes);
		e5.calculerMoyenne(e5.Notes);
		// exemple affichage + stockage dans la variable moy
		System.out.println("Exemple affichage + stockage ");
		double moy = e1.calculerMoyenne(e1.Notes);
		System.out.println("la moyenne  : " + moy);

		// exemple on ajoute les matieres

		System.out.println("Exemple d'ajout de cinq cours: ");
		e1.ajouterCours(m4.Intitulé); 
		e2.ajouterCours(m1.Intitulé);
		e3.ajouterCours(m5.Intitulé);
		e4.ajouterCours(m2.Intitulé);
		e5.ajouterCours(m3.Intitulé);
		//affichage de touts les etudiants
		System.out.println("L'étudiant numéro: " + e1.getNumEtu() + " S'appel: "+ e1.nom 
				+ " " + e1.prenom + " Leur Age est: " + e1.getAge() 
		+ " étudier les matières suivantes :" + e1.Cours );
		System.out.println("L'étudiant numéro: " + e2.getNumEtu() + " S'appel: "+ e2.nom 
				+ " " + e2.prenom + " Leur Age est: " + e2.getAge() 
		+ " étudier les matières suivantes :" + e2.Cours );
		System.out.println("L'étudiant numéro: " + e3.getNumEtu() + " S'appel: "+ e3.nom 
				+ " " + e3.prenom + " Leur Age est: " + e3.getAge() 
		+ " étudier les matières suivantes :" + e3.Cours );
		System.out.println("L'étudiant numéro: " + e4.getNumEtu() + " S'appel: "+ e4.nom 
				+ " " + e4.prenom + " Leur Age est: " + e4.getAge() 
		+ " étudier les matières suivantes :" + e4.Cours );
		System.out.println("L'étudiant numéro: " + e5.getNumEtu() + " S'appel: "+ e5.nom 
				+ " " + e5.prenom + " Leur Age est: " + e5.getAge() 
		+ " étudier les matières suivantes :" + e5.Cours );

	}

}
