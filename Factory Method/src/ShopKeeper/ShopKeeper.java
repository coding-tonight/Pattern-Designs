package ShopKeeper;

import characters.Character;

public class ShopKeeper implements Character {

    @Override
    public void move() {
        System.out.println("ShopKeeper move");
    }

    @Override
    public void speak() {
        System.out.println("Shopkeeper say Hello");
    }
}


