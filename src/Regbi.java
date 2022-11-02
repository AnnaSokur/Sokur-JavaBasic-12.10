public class Regbi {
        public static void main(String[] args) {

            double[] team1 = new double[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 27, 33};
            double result1 = 0;
            int i;
            for (i = 0; i < 25; i++) {
                result1 = result1 + team1[i];

            }


            System.out.println(" Среднее арифметическое возраста игроков первой коменды " + result1 / team1.length);

            double[] team2 = new double[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 39, 27};
            double result2 = 0;
            int k;
            for (k = 0; k < 25; k++) {
                result2 = result2 + team2[k];

            }

            System.out.println(" Среднее арифметическое возраста игроков второй коменды " + result2 / team2.length);


        }
    }

