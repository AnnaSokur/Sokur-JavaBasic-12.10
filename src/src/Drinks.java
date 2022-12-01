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

        //2.тут константами задала ціну

        //3.Сделайте подсчет количества сделанных напитков и общей суммы которую должен заплатить клиент-
        //тут я не розумію як це записати - через сканер і запитати "скільки чашок чаю" чи якось через цикл

        Scanner scanner = new Scanner(System.in);

        void coffeePrepare () {
            System.out.println("Чашка кофе стоит: " + COFFEE);
        }

        void teaPrepare () {
            System.out.println("Чашка чая стоит: " + TEA);
        }

        void lemonadePrepare () {
            System.out.println("Стакан лимонада стоит: " + LEMONADE);
        }

        void mojitoPrepare () {
            System.out.println("Стакан мохито стоит: " + MOJITO);
        }

        void mineralWaterPrepare () {
            System.out.println("Стакан минеральной воды стоит: " + MINERAL_WATER);
        }

        void cocaColaPrepare () {
            System.out.println("Стакан кока колы стоит: " + COCA_COLA);
        }

        //4. методи приготування для кожного напою


        Scanner in = new Scanner(System.in);
        in = new Scanner(System.in);
        System.out.print("Введите свой напиток: ");

        switch (drinks) {     // не розумію чому дрінкс у свічі горить червонить
            case DrinksMachine.COFFEE:
                System.out.println(DrinksMachine.COFFEE + " - Цена - " + 40);
                break;
            case DrinksMachine.TEA:
                System.out.println(DrinksMachine.TEA + " - Цена - " + 30);
                break;
            case DrinksMachine.LEMONADE:
                System.out.println(DrinksMachine.LEMONADE + " - Цена - " + 25);
                break;
            case DrinksMachine.MOJITO:
                System.out.println(DrinksMachine.MOJITO + " - Цена - " + 25);
                break;
            case DrinksMachine.MINERAL_WATER:
                System.out.println(DrinksMachine.MINERAL_WATER + " - Цена - " + 15);
                break;
            case DrinksMachine.COCA_COLA:
                System.out.println(DrinksMachine.COCA_COLA + " - Цена - " + 20);
                break;
            default:

                System.out.println("Что-нибудь еще? ДА/НЕТ");
        }
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



