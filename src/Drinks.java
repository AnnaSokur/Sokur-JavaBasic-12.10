import java.util.Arrays;
import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {

        final int COFFEE = 40;
        final int TEA = 30;
        final int LEMONADE = 25;
        final int MOJITO = 25;
        final int MINERAL_WATER = 15;
        final int COCA_COLA = 20;

        Scanner scanner = new Scanner(System.in);

        public int coffeePrepare() {
            System.out.println("Чашка кофе стоит: " + COFFEE);
            System.out.print("Введите количество чашек кофе: ");
            return scanner.nextInt();
        }

        public int teaPrepare() {
            System.out.println("Чашка чая стоит: " + TEA);
            System.out.print("Введите количество чашек чая: ");
            return scanner.nextInt();
        }

        public int lemonadePrepare() {
            System.out.println("Стакан лимонада стоит: " + LEMONADE);
            System.out.print("Введите количество стаканов лимонада: ");
            return scanner.nextInt();
        }

        public int mojitoPrepare() {
            System.out.println("Стакан мохито стоит: " + MOJITO);
            System.out.print("Введите количество стаканов мохито: ");
            return scanner.nextInt();
        }

        public int mineralWaterPrepare() {
            System.out.println("Стакан минеральной воды стоит: " + MINERAL_WATER);
            System.out.print("Введите количество стаканов минеральной воды: ");
            return scanner.nextInt();
        }

        public int cocaColaPrepare() {
            System.out.println("Стакан кока колы стоит: " + COCA_COLA);
            System.out.print("Введите количество стаканов кока колы: ");
            return scanner.nextInt();

        }
    }

    Scanner scanner = new Scanner(System.in);
    Drinks drinks = new Drinks();

    boolean a = true;
    int number = 0;
    while(a)

    {
        System.out.println("Выберите напиток: ");

        String drinksChoice = "coffee";
        drinksChoice.toUpperCase();
        Drinks drinks = Drinks.valueOf(drinksChoice);

        String drinksChoice = "tea";
        drinksChoice.toUpperCase();
        Drinks drinks = Drinks.valueOf(drinksChoice);

        String drinksChoice = "lemonade";
        drinksChoice.toUpperCase();
        Drinks drinks = Drinks.valueOf(drinksChoice);

        String drinksChoice = "mojito";
        drinksChoice.toUpperCase();
        Drinks drinks = Drinks.valueOf(drinksChoice);

        String drinksChoice = "mineral water";
        drinksChoice.toUpperCase();
        Drinks drinks = Drinks.valueOf(drinksChoice);

        String drinksChoice = "coca cola";
        drinksChoice.toUpperCase();
        Drinks drinks = Drinks.valueOf(drinksChoice);

        switch (drinks) {
            case DrinksMachine.COFFEE:
                DrinksMachine.valueOf("Кофе").equals(DrinksMachine.COFFEE);
                int totalPrice = number * DrinksMachine.COFFEE.getPrice();
                System.out.println(DrinksMachine.COFFEE + " - Цена - " + totalPrice);
                break;
            case DrinksMachine.TEA:
                DrinksMachine.valueOf("Чай").equals(DrinksMachine.TEA);
                totalPrice = number * DrinksMachine.TEA.getPrice();
                System.out.println(DrinksMachine.TEA + " - Цена - " + totalPrice);
                break;
            case DrinksMachine.LEMONADE:
                DrinksMachine.valueOf("Лимонад").equals(DrinksMachine.LEMONADE);
                totalPrice = number * DrinksMachine.LEMONADE.getPrice();
                System.out.println(DrinksMachine.LEMONADE + " - Цена - " + totalPrice);
                break;
            case DrinksMachine.MOJITO:
                DrinksMachine.valueOf("Мохито").equals(DrinksMachine.MOJITO);
                totalPrice = number * DrinksMachine.MOJITO.getPrice();
                System.out.println(DrinksMachine.MOJITO + " - Цена - " + totalPrice);
                break;
            case DrinksMachine.MINERAL_WATER:
                DrinksMachine.valueOf("Минеральная вода").equals(DrinksMachine.MINERAL_WATER);
                totalPrice = number * DrinksMachine.MINERAL_WATER.getPrice();
                System.out.println(DrinksMachine.MINERAL_WATER + " - Цена - " + totalPrice);
                break;
            case DrinksMachine.COCA_COLA:
                DrinksMachine.valueOf("Кока Кола").equals(DrinksMachine.COCA_COLA);
                totalPrice = number * DrinksMachine.COCA_COLA.getPrice();
                System.out.println(DrinksMachine.COCA_COLA + " - Цена - " + totalPrice);
                break;
            default:

                System.out.println("Что-нибудь еще? ДА/НЕТ");
                boolean moreDrinks = true;
                while (moreDrinks) {
                    String answer = scanner.nextLine();
                    if (answer.equals("НЕТ") || answer.equals("НЕТ") || answer.equals("НЕТ")) {
                        moreDrinks = false;
                        a = false;
                    } else if (answer.equals("ДА") || answer.equals("ДА") || answer.equals("ДА")) {
                        moreDrinks = false;
                    } else {
                        System.out.println("Ответьте - ДА/НЕТ");

                    }
                }
        }
        int totalPrice = 0;
        for
        System.out.println("TOTAL PRICE : " + totalPrice);
    }

    private static Drinks valueOf(String drinksChoice) {
    }
}

