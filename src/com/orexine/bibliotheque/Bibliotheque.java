package com.orexine.bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque implements IBibliotheque {
    private List<ILivre> livres;
    private List<IMembre> membres;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
        this.membres = new ArrayList<>();
    }

    @Override
    public void ajouterLivre(ILivre livre) {
        livres.add(livre);
    }

    @Override
    public void ajouterMembre(IMembre membre) {
        membres.add(membre);
    }

    @Override
    public void genererRapport() {
        System.out.println("Rapport de la Bibliothèque :");
        for (IMembre membre : membres) {
            System.out.println("Membre : " + membre.getNom());
            System.out.println("Livres empruntés :");
            for (ILivre livre : ((Membre) membre).getLivresEmpruntes()) {
                System.out.println(" - " + livre.getTitre());
            }
        }
    }
}
