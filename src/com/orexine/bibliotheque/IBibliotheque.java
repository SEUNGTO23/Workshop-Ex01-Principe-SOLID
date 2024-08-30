package com.orexine.bibliotheque;

public interface IBibliotheque {
    void ajouterLivre(ILivre livre);
    void ajouterMembre(IMembre membre);
    void genererRapport();
}
