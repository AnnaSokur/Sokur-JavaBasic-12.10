import java.util.Scanner;

public class HomeTask9 {
    public static void main(String[] args) {
        int playerNumber = 0;
        int tries = 0;
        int systemNumber = 0;

        Scanner in = new Scanner(System.in);
        in = new Scanner(System.in);
        System.out.print("Компьютер загадал число. Введите число от 0 до 9: ");

        systemNumber = (int) (Math.random() * 10);

        do {
            tries++;
            System.out.print("Введите ваше число: ");
            playerNumber = in.nextInt();
            if (playerNumber > systemNumber)
                System.out.println("Загаданное число меньше от вашего.");
            else if (playerNumber < systemNumber)
                System.out.println("Загаданное число больше от вашего.");
            else System.out.println("Вы правильно угадали!");
        } while (playerNumber != systemNumber);
        System.out.println("Количество попыток: " + tries);

        }
}