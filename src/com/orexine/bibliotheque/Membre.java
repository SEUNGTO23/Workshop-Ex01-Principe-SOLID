package com.orexine.bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Membre implements IMembre {
    private String nom;
    private List<ILivre> livresEmpruntes;

    public Membre(String nom) {
        this.nom = nom;
        this.livresEmpruntes = new ArrayList<>();
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void emprunterLivre(ILivre livre) {
        if (livre.estDisponible()) {
            livre.emprunter();
            livresEmpruntes.add(livre);
        }
    }

    @Override
    public void retournerLivre(ILivre livre) {
        if (livresEmpruntes.contains(livre)) {
            livre.retourner();
            livresEmpruntes.remove(livre);
        }
    }

    public List<ILivre> getLivresEmpruntes() {
        return livresEmpruntes;
    }
}
