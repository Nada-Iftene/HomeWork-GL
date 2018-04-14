package Logiciel;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {

		// liste des notes
		ArrayList<Integer> liste = new ArrayList<Integer>();
		liste.add(15);
		liste.add(10);
		liste.add(13);
		liste.add(8);
		liste.add(12);

		Matiere m1 = new Matiere("Génie logiciel", 45);
		Matiere m2 = new Matiere("Base de données", 45);
		Matiere m3 = new Matiere("Systèmes d'exploitation", 67);
		Matiere m4 = new Matiere("Théorie des graphes", 45);
		Matiere m5 = new Matiere("Réseau", 67);
		Matiere m6 = new Matiere("DevWeb", 45);
		Matiere m7 = new Matiere("Java", 45);
		Matiere m8 = new Matiere("Anglais", 22);

		// partie de creation d'une liste de 4 cours
		HashSet<String> deuxieme_année = new HashSet<String>();
		// on prends comme exemple une variable deuxieme_annee, qui constitue de 4
		// matiéres
		deuxieme_année.add(m1.Intitulé);
		deuxieme_année.add(m5.Intitulé);
		deuxieme_année.add(m8.Intitulé);
		deuxieme_année.add(m2.Intitulé);

		// partie creation des etudiants
		Etudiant e1 = new Etudiant("Ahmed", "Bahmani", 20, "1998", deuxieme_année, liste, m1);
		Etudiant e2 = new Etudiant("Fortas", "Oussama", 19, "1999", deuxieme_année, liste, m1);
		Etudiant e3 = new Etudiant("Belhadj", "Amine", 21, "1997", deuxieme_année, liste, m1);
		Etudiant e4 = new Etudiant("Bekhoucha", "Djawed", 19, "1999", deuxieme_année, liste, m1);
		Etudiant e5 = new Etudiant("Ahmed", "Bahmani", 22, "1996", deuxieme_année, liste, m1);
		// ici on assume que tous les etudiants partages la meme liste des matiéres (qui
		// est dans notre exemple la variable deuxieme_année) et il partagent aussi la
		// meme liste de notes (ce n'est qu'un test)
		// Ici on teste la fonction qui calcule la moyenne, comme exemple on prends le
		// premier etudiant
		// cette fonction fait a deux options : elle affiche la moyenne avec la
		// posibilité de la stocker dans une variable

		// exemple affichage seul
		System.out.println("Exemple affichage seul : ");
		e1.calculerMoyenne(e1.Notes);
		// exemple affichage + stockage dans la variable mo
		System.out.println("Exemple affichage + stockage ");
		double mo = e1.calculerMoyenne(e1.Notes);
		System.out.println("le contenu de la variable mo est maintenant : " + mo);

		// exemple on ajoute la matiére m4 (Théorie de graphes) pour le troisiéme etudiant

		System.out.println("Exemple d'ajout d'un cours: ");
		e3.ajouterCours(m4.Intitulé); 

	}

}
