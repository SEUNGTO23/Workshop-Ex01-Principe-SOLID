package com.orexine.bibliotheque;

public class Livre implements ILivre {
    private String titre;
    private boolean disponible;

    public Livre(String titre) {
        this.titre = titre;
        this.disponible = true;
    }

    @Override
    public String getTitre() {
        return titre;
    }

    @Override
    public boolean estDisponible() {
        return disponible;
    }

    @Override
    public void emprunter() {
        if (disponible) {
            disponible = false;
        }
    }

    @Override
    public void retourner() {
        disponible = true;
    }
}
