package com.gestionnairedemonstre.pojo.monsters;

/**
 * Enumeration of kind of monsters family.
 */
public enum FamilleMonstre {
    HUMAIN("Humain"),
    RAT("Rat"),
    MORTVIVANT("Mort-Vivant"),
    BETE("Bete"),
    AUTRE("Autre");

    /** The UI readavle value of the monster family kind. */
    private String _textValue;

    /**
     * Default constructor.
     * @param pTextValue The default value for monster family kind.
     */
    FamilleMonstre(String pTextValue){
        _textValue = pTextValue;
    }

    /**
     * Getter for String monster family kind value.
     * @return Kind of monster.
     */
    public String get_textValue() {
        return _textValue;
    }
}