
package com.mycompany.factorybuilder;


public class CharacterFactory {

    // TODO: Add a factory method that returns an object (Archer, FlagBearer, or Knight) by its name:
    public static Characters createCharacter(CharacterTypes type, String name){
        switch (type){
            case ARCHER:
                return new Archer(name);
            case FLAG_BEARER:
                return new FlagBearer(name);
            case KNIGHT:
                return new Knight(name);
            default:
                return null;

        }
    }
}
