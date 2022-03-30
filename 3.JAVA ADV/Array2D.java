public class Array2D {
    public static void main(String[] args) {
        int [][] Array2D = new int[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                Array2D[i][j] = i + j;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(Array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}

