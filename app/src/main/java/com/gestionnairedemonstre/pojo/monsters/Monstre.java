package com.gestionnairedemonstre.pojo.monsters;

/**
 * A representation of a Monstre.
 */
public class Monstre {
    /*liste des attributs de base des monstres*/
    String _nomMonstre;
    String _classeMonstre; /*il s'agit de la "famille" du monstre : Humain, Animal, Mort-vivant, Divers*/
    int _pointsVie;
    int _pointsDegats;

    /*constructeur par défaut de la classe Monstre*/
    public Monstre(){
        System.out.println("Création d'un vilain en cours...");
        _nomMonstre = "Minion";
        _classeMonstre = "Minion";
        _pointsVie = 10;
        _pointsDegats = 1;
    }

    /*constructeur surchargé avec paramètres*/
    public Monstre(String pNom, String pClasse, int pHP, int pDP){
        System.out.println("Création d'un vilain avec des paramètres en cours...");
        _nomMonstre = pNom;
        _classeMonstre = pClasse;
        _pointsVie = pHP;
        _pointsDegats = pDP;
    }
}
