import Buyer.BuyerFactory;
import characters.Character;
import characters.CharacterFactory;
import ShopKeeper.ShopKeeperFactory;

public class Main {
    public static void main(String[] args) {
        CharacterFactory shopkeeperFactory = new ShopKeeperFactory();
        Character shopkeeper = shopkeeperFactory.createCharacter();
        shopkeeper.move();
        shopkeeper.speak();

        CharacterFactory buyerFactory = new BuyerFactory();
        Character buyer = buyerFactory.createCharacter();

        buyer.speak();
        buyer.move();
    }
}