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

		Matiere m1 = new Matiere("G�nie logiciel", 45);
		Matiere m2 = new Matiere("Base de donn�es", 45);
		Matiere m3 = new Matiere("Syst�mes d'exploitation", 67);
		Matiere m4 = new Matiere("Th�orie des graphes", 45);
		Matiere m5 = new Matiere("R�seau", 67);
		Matiere m6 = new Matiere("DevWeb", 45);
		Matiere m7 = new Matiere("Java", 45);
		Matiere m8 = new Matiere("Anglais", 22);

		// partie de creation d'une liste de 4 cours
		HashSet<String> deuxieme_ann�e = new HashSet<String>();
		// on prends comme exemple une variable deuxieme_annee, qui constitue de 4
		// mati�res
		deuxieme_ann�e.add(m1.Intitul�);
		deuxieme_ann�e.add(m5.Intitul�);
		deuxieme_ann�e.add(m8.Intitul�);
		deuxieme_ann�e.add(m2.Intitul�);

		// partie creation des etudiants
		Etudiant e1 = new Etudiant("Ahmed", "Bahmani", 20, "1998", deuxieme_ann�e, liste, m1);
		Etudiant e2 = new Etudiant("Fortas", "Oussama", 19, "1999", deuxieme_ann�e, liste, m1);
		Etudiant e3 = new Etudiant("Belhadj", "Amine", 21, "1997", deuxieme_ann�e, liste, m1);
		Etudiant e4 = new Etudiant("Bekhoucha", "Djawed", 19, "1999", deuxieme_ann�e, liste, m1);
		Etudiant e5 = new Etudiant("Ahmed", "Bahmani", 22, "1996", deuxieme_ann�e, liste, m1);
		// ici on assume que tous les etudiants partages la meme liste des mati�res (qui
		// est dans notre exemple la variable deuxieme_ann�e) et il partagent aussi la
		// meme liste de notes (ce n'est qu'un test)
		// Ici on teste la fonction qui calcule la moyenne, comme exemple on prends le
		// premier etudiant
		// cette fonction fait a deux options : elle affiche la moyenne avec la
		// posibilit� de la stocker dans une variable

		// exemple affichage seul
		System.out.println("Exemple affichage seul : ");
		e1.calculerMoyenne(e1.Notes);
		// exemple affichage + stockage dans la variable mo
		System.out.println("Exemple affichage + stockage ");
		double mo = e1.calculerMoyenne(e1.Notes);
		System.out.println("le contenu de la variable mo est maintenant : " + mo);

		// exemple on ajoute la mati�re m4 (Th�orie de graphes) pour le troisi�me etudiant

		System.out.println("Exemple d'ajout d'un cours: ");
		e3.ajouterCours(m4.Intitul�); 

	}

}
