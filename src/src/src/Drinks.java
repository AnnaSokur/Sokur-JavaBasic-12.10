import java.util.Scanner;

public class Drinks {

    public Drinks(String coffee, String s, DrinksMachine coffee1) {
    }

    public static void main(String[] args) {

        final int COFFEE = 40;
        final int TEA = 30;
        final int LEMONADE = 25;
        final int MOJITO = 25;
        final int MINERAL_WATER = 15;
        final int COCA_COLA = 20;


        Scanner in = new Scanner(System.in);
        System.out.print("Введите свой напиток: ");

        String choice = in.nextLine();
        DrinksMachine drinksMachineChoice = DrinksMachine.valueOf(choice.toUpperCase());
        switch (drinksMachineChoice) {
            case COFFEE:
                Drinks coffee = new Drinks("COFFEE", "40", DrinksMachine.COFFEE);
                System.out.println("Ваш напиток готов");
                break;
            case TEA:
                Drinks tea = new Drinks("TEA", "30", DrinksMachine.TEA);
                System.out.println("Ваш напиток готов");
                break;
            case LEMONADE:
                Drinks lemonade = new Drinks("LEMONADE", "25", DrinksMachine.LEMONADE);
                System.out.println("Ваш напиток готов");
                break;
            case MOJITO:
                Drinks mojito = new Drinks("MOJITO", "25", DrinksMachine.MOJITO);
                System.out.println("Ваш напиток готов");
                break;
            case MINERAL_WATER:
                Drinks mineralWater = new Drinks("MINERAL WATER", "15", DrinksMachine.MINERAL_WATER);
                System.out.println("Ваш напиток готов");
                break;
            case COCA_COLA:
                Drinks cocaCola = new Drinks("COCA COLA", "20", DrinksMachine.COCA_COLA);
                System.out.println("Ваш напиток готов");
                break;
            default:
                System.out.println("Что-нибудь еще? ДА/НЕТ");
        }
    }
    void coffeePrepare() {
        System.out.println("Чашка кофе стоит: " + DrinksMachine.COFFEE);
    }

    void teaPrepare() {
        System.out.println("Чашка чая стоит: " + DrinksMachine.TEA);
    }

    void lemonadePrepare() {
        System.out.println("Стакан лимонада стоит: " + DrinksMachine.LEMONADE);
    }

    void mojitoPrepare() {
        System.out.println("Стакан мохито стоит: " + DrinksMachine.MOJITO);
    }

    void mineralWaterPrepare() {
        System.out.println("Стакан минеральной воды стоит: " + DrinksMachine.MINERAL_WATER);
    }

    void cocaColaPrepare() {
        System.out.println("Стакан кока колы стоит: " + DrinksMachine.COCA_COLA);
    }

}



