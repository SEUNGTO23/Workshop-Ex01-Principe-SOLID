package com.orexine.bibliotheque;

public interface IMembre {
    String getNom();
    void emprunterLivre(ILivre livre);
    void retournerLivre(ILivre livre);
}
