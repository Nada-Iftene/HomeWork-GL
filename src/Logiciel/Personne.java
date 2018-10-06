package Logiciel;

import java.util.List;
import java.util.Set;

public class Personne {
	// cette classe est simple, elle constitue de trois variables, nom, prenom, age
	public String nom;
	public String prenom;
	private int age;
   //constructeur
	public Personne(String nom, String prenom, int age) {

		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	// partie setters et getters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;	}
    public String getPrenom() {
		return prenom;
	}
    public void setPrenom(String prenom) {
		this.prenom = prenom;}
	public int getAge() {
		return age;	}
	public void setAge(int age) {
		this.age = age;
	}
}
