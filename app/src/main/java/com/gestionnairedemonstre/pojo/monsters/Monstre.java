package com.gestionnairedemonstre.pojo.monsters;

/**
 * A representation of a Monstre.
 */
public class Monstre {
    /*liste des attributs de base des monstres*/
    private String _nomMonstre;
    private String _classeMonstre; /*il s'agit de la "famille" du monstre : Humain, Animal, Mort-vivant, Divers*/
    private int _pointsVie;
    private int _pointsDegats;

    /*constructeur par d�faut de la classe Monstre*/
    public Monstre(){
        System.out.println("Cr�ation d'un vilain en cours...");
        _nomMonstre = "Minion";
        _classeMonstre = "Minion";
        _pointsVie = 10;
        _pointsDegats = 1;
    }

    /*constructeur surcharg� avec param�tres*/
    public Monstre(String pNom, String pClasse, int pHP, int pDP){
        System.out.println("Cr�ation d'un vilain avec des param�tres en cours...");
        _nomMonstre = pNom;
        _classeMonstre = pClasse;
        _pointsVie = pHP;
        _pointsDegats = pDP;
    }

    /**
     * Getteurs de la classe Monstre
     * seront utilis�s dans les m�thodes afin de r�cup�rer les valeurs d�sir�es de l'objet instanci�.
     */

    public String get_nomMonstre() {
        return _nomMonstre;
    }
    public String get_classeMonstre() {
        return _classeMonstre;
    }
    public int get_pointsVie() {
        return _pointsVie;
    }
    public int get_pointsDegats() {
        return _pointsDegats;
    }

    /**
     * M�thodes de la classe Monstre
     * ces m�thodes sont impl�ment�es ici car elles seront communes � tous les monstres, qu'ils soient styl�s ou non.
     */

    /**
     * Ici je ne sais pas trop comment l'appli va g�rer les entr�es. Je voyais un truc genre quand un joueur attaque un monstre, l'appli propose un pannel de d�g�ts
     * (ex : 10/15/20/25/30/35/40/50) et le MJ choisit les d�g�ts appropri�s, et dans ce cas l� je suppose qu'il s'agit d'une entr�e "clavier". Donc je ne sais pas trop quoi mettre ici.
     * @param pDegatsArme
     */
    public int PerdrePointsVie(int pDegatsArme){
        _pointsVie = _pointsVie - pDegatsArme;
        if(_pointsVie <= 0){
            _pointsVie = 0;
            System.out.println(get_nomMonstre()+" vient de mourir.");
        }

        return _pointsVie;
    }

    /**
     * M�thode qui servira � afficher � l'�cran du MJ le nombre de d�g�ts qu'un monstre inflige � un joueur. Peut �tre afficher une liste de tous les joueurs et du
     * total des d�g�ts que chacun d'eux subit � chaque tour. Je me demandais aussi si on ne pourrait pas faire une oetite fonction pour choisir un nombre entre 1 et le nb max de joueur
     * comme �a c'est le programme qui choisit al�atoirement la cible de chaque attaque.
     */
    public int Attaquer(){
             //je n'arrive pas � caster le int des d�g�ts en string
        //System.out.println("Le joueur subit " + get_pointsDegats() + " points de d�g�ts");
    }

}
