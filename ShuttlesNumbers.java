public class ShuttlesNumbers {
    public static void main(String[] args) {
        int x = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 0 && j == 0 && k == 0) {
                        continue;
                    }

                    if (x > 100) {
                        break;
                    }
                    if (i != 4 && i != 9 && j != 4 && j != 9 && k != 4 && k != 9) {

                        System.out.println("Shuttle " + x + " with number " + i + j + k);
                        x++;
                    }
                }
            }
        }
    }
}