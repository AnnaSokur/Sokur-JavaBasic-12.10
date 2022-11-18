package Burgers;
import Burgers.Burger;

public class BurgerMain {
    public static void main(String[] args) {

        Burger classicBurger = new Burger("bun:", "meat:", "cheese:", "greens", "true:");
        System.out.println();
        Burger healthyBurger = new Burger("bun:", "meat:", "cheese:", "greens:");
        System.out.println();
        Burger doubleBurger = new Burger("bun:", "doubleMeat:", "cheese:", "greens", "true:");
        System.out.println();


    }
}
