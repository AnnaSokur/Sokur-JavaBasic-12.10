import java.util.Random;
import java.util.Scanner;

public class HomeTask9 {
    public static void main(String[] args) {
        int guessNumber = 0;
        int tries = 3;

        Scanner in = new Scanner(System.in);
        in = new Scanner(System.in);
        System.out.print("Компьютер загадал число. Введите число: ");


        if (guessNumber > 0) {
        } else if (guessNumber < 11) {

        }

        int num = in.nextInt();
        System.out.printf("Ваше число " + num);

        Random randomizer = new Random();
        guessNumber = randomizer.nextInt(10);

        System.out.println(" Загаданное число " + guessNumber);


        if (guessNumber != num) {
            System.out.println("Неправильное число, попробуйте еще раз");
            System.out.println("Осталось " + (tries--) + " попытки из " + tries);

        }
        else {

            System.out.println("Вы угадали");


        }

    }
}
