package src;

import java.util.Scanner;

import static src.DrinksMachine.*;

public class Drinks {
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
                //треба викликати методи
                break;
            case TEA:
                break;
            case LEMONADE:
                break;
            case MOJITO:
                break;
            case MINERAL_WATER:
                break;
            case COCA_COLA:
                break;
            default:
                System.out.println("Что-нибудь еще? ДА/НЕТ");
        }
    }
    void coffeePrepare() {
        System.out.println("Чашка кофе стоит: " + COFFEE);
    }

    void teaPrepare() {
        System.out.println("Чашка чая стоит: " + TEA);
    }

    void lemonadePrepare() {
        System.out.println("Стакан лимонада стоит: " + LEMONADE);
    }

    void mojitoPrepare() {
        System.out.println("Стакан мохито стоит: " + MOJITO);
    }

    void mineralWaterPrepare() {
        System.out.println("Стакан минеральной воды стоит: " + MINERAL_WATER);
    }

    void cocaColaPrepare() {
        System.out.println("Стакан кока колы стоит: " + COCA_COLA);
    }

    //5. зробила switch-case

    //6. Добавьте возможность выбора напитка для пользователя, и в зависимости от выбора делайте ему напиток-
    //тут як я зрозуміла треба вставити цей код
    //String drinksChoice = "tea";
    //drinksChoice.toUpperCase();
    //Drinks drinks = Drinks.valueOf(drinksChoice);
    //треба зробити такий код для кожного напою?
    //наприклад
    //String drinksChoice = "coffee";
    //drinksChoice.toUpperCase();
    //Drinks drinks = Drinks.valueOf(drinksChoice);


    //7 Пользователь должен иметь возможность заказать несколько напитков
    //тут треба через цикл по типу цього чи якось іншим способом
    //int tries=0;
    //do {
    //tries++;


    //8 и в конце увидеть сколько денег он должен заплатить;
    // тут я не можу зрозуміти як це все приплюсувати до себе


}



