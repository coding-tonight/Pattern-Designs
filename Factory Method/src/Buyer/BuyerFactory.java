package Buyer;

import characters.Character;
import characters.CharacterFactory;

public class BuyerFactory implements CharacterFactory {
    public Character createCharacter() { return new Buyer(); }
}
