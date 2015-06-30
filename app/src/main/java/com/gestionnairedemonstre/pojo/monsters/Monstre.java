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

    /**
     * Getteurs de la classe Monstre
     * seront utilisés dans les méthodes afin de récupérer les valeurs désirées de l'objet instancié.
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
     * Méthodes de la classe Monstre
     * ces méthodes sont implémentées ici car elles seront communes à tous les monstres, qu'ils soient stylés ou non.
     */

    /**
     * Ici je ne sais pas trop comment l'appli va gérer les entrées. Je voyais un truc genre quand un joueur attaque un monstre, l'appli propose un pannel de dégâts
     * (ex : 10/15/20/25/30/35/40/50) et le MJ choisit les dégâts appropriés, et dans ce cas là je suppose qu'il s'agit d'une entrée "clavier". Donc je ne sais pas trop quoi mettre ici.
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
     * Méthode qui servira à afficher à l'écran du MJ le nombre de dégâts qu'un monstre inflige à un joueur. Peut être afficher une liste de tous les joueurs et du
     * total des dégâts que chacun d'eux subit à chaque tour. Je me demandais aussi si on ne pourrait pas faire une oetite fonction pour choisir un nombre entre 1 et le nb max de joueur
     * comme ça c'est le programme qui choisit aléatoirement la cible de chaque attaque.
     */
    public int Attaquer(){
             //je n'arrive pas à caster le int des dégâts en string
        //System.out.println("Le joueur subit " + get_pointsDegats() + " points de dégâts");
    }

}
