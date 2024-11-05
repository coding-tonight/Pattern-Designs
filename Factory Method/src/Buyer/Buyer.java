package Buyer;

import characters.Character;

public class Buyer implements Character {

    @Override
    public void move() {
       System.out.println("Buyer move...");
    }

    @Override
    public void speak() {
        System.out.println("Buyer speak....");
    }
}
