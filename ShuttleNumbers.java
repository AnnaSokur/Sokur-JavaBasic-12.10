public class ShuttleNumbers {
    public static void main(String[] args) {
        int x = 1;

        for (int i = 1; i < 10; i++) {
            if (x > 100) {
                break;
            }
            if (i != 4 & i != 9) {


                for (int j = 0; j < 10; j++) {
                    if (x > 100) {
                        break;
                    }
                    if (j != 4 & j != 9) {

                        for (int k = 0; k < 10; k++) {
                            if (k != 4 & k != 9) {

                                System.out.println("Shuttle " + x + " with number " + i + k + j);
                                x++;
                                if (x > 100) {
                                    break;

                                }

                            }
                        }


                    }
                }
            }
        }
    }
}
