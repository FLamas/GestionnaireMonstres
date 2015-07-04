package com.gestionnairedemonstre.pojo.monsters;

/**
 * Abstract representation of a Boss.
 *
 * @author FLamas
 */
public  class Boss extends Monstre {

    /**
     * Default Boss constructor.
     */
    public Boss(){
        super("Boss", FamilleMonstre.HUMAIN, 100, 10);
    }
}
