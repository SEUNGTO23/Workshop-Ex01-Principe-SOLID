package com.orexine.bibliotheque;

public interface ILivre {
    String getTitre();
    boolean estDisponible();
    void emprunter();
    void retourner();
}
