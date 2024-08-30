package com.orexine.bibliotheque;

public class Main {
    public static void main(String[] args) {
        // Créer une bibliothèque
        IBibliotheque bibliotheque = new Bibliotheque();

        // Ajouter des livres
        ILivre livre1 = new Livre("Créez votre première classe Java");
        ILivre livre2 = new Livre("Initiation au developpement web");
        ILivre livre3 = new Livre("Principe de conception logiciel");

        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);
        bibliotheque.ajouterLivre(livre3);

        // Ajouter des membres
        IMembre membre1 = new Membre("Stephane");
        IMembre membre2 = new Membre("SEUNGTO");

        bibliotheque.ajouterMembre(membre1);
        bibliotheque.ajouterMembre(membre2);

        // Emprunter des livres
        membre1.emprunterLivre(livre1);
        membre1.emprunterLivre(livre2);
        membre2.emprunterLivre(livre3);

        // Retourner des livres
        membre1.retournerLivre(livre1);

        // Générer un rapport
        bibliotheque.genererRapport();
    }
}
