package Burgers;
import Burgers.Burger;

public class BurgerMain {
    public static void main(String[] args) {

        Burger classicBurger = new Burger(": bun,", " meat,", " cheese,", " greens,", " mayonnaise");

        Burger healthyBurger = new Burger(": bun,", " meat,", " cheese,", " greens");

        Burger doubleBurger = new Burger(": bun,", " meat,", " doubleMeat,", " cheese,", " greens,", " mayonnaise");




    }
}
