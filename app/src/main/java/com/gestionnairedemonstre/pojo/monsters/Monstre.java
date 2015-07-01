package com.gestionnairedemonstre.pojo.monsters;

/**
 * A representation of a Monstre.
 *
 * @author FLamas
 */
public class Monstre {
    /**
     * Nom du monstre.
     */
    private String _nomMonstre;

    /**
     * Il s'agit de la famille du monstre : Humain, Animal, Mort-vivant, Divers.
     */
    private String _classeMonstre;

    /**
     * Points de vie du monstre.
     */
    private int _pointsVie;

    /**
     * Points de degat du monstre.
     */
    private int _pointsDegats;

    /**
     * Constructeur par defaut. Un monstre de base sera initialisé.
     */
    public Monstre(){
        System.out.println("Creation d'un vilain en cours...");
        _nomMonstre = "Minion";
        _classeMonstre = "Minion";
        _pointsVie = 10;
        _pointsDegats = 1;
    }

    /**
     * Constructeur avec tous les parametres pour initialisation du monstre.
     *
     * @param pNom Nom du monstre.
     * @param pClasse Classe/Famille du monstre.
     * @param pHP Points de vie du monstre.
     * @param pDP Points de degats du monstre.
     */
    public Monstre(String pNom, String pClasse, int pHP, int pDP){
        System.out.println("Creation d'un vilain avec des parametres en cours...");
        _nomMonstre = pNom;
        _classeMonstre = pClasse;
        _pointsVie = pHP;
        _pointsDegats = pDP;
    }

    /**
     * Getter du nom.
     * @return Nom du monstre.
     */
    public String get_nomMonstre() {
        return _nomMonstre;
    }

    /**
     * Getter classe/famille.
     * @return Classe/Famille du monstre.
     */
    public String get_classeMonstre() {
        return _classeMonstre;
    }

    /**
     * Getter points de vie.
     * @return Points de vie restant du monstre.
     */
    public int get_pointsVie() {
        return _pointsVie;
    }

    /**
     * Getter points de degats.
     * @return Points de degats effectues par le monstre.
     */
    public int get_pointsDegats(){
        return _pointsDegats;
    }

    /**
     * Gestion d un coup recu par le monstre avec une certaine valeur de degats d arme.
     * @param pDegatsArme Les degats de l arme frappant le monstre.
     */
    public int PerdrePointsVie(int pDegatsArme){
        _pointsVie = _pointsVie - pDegatsArme;
        if(_pointsVie <= 0){
            _pointsVie = 0;
            System.out.println(get_nomMonstre()+" vient de mourir.");
        }

        return _pointsVie;
    }
}
