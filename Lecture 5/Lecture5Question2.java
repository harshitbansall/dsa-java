public class Lecture5Question2 {
    public static void main(String[] args) {
        int columns = 10;
        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= columns; k++) {
                if (i == 1 || i == rows || k == 1 || k == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
