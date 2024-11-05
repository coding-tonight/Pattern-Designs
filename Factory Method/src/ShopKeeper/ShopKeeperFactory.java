package ShopKeeper;

import characters.Character;
import characters.CharacterFactory;

public class ShopKeeperFactory implements CharacterFactory {
     public Character createCharacter() {
          return new ShopKeeper();
     }
}
