public class Matrix {
    public static void main(String[] args) {

            int n = 7;
            int m = 7;
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = n * i + j;
                }
            }
            System.out.println("Исходная матрица");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%4d", a[i][j]);
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
            System.out.println();
            System.out.println("Транспортированная матрица");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%4d", a[i][j]);
                }
                System.out.println();
            }
        }
    }