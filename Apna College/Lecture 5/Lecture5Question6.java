public class Lecture5Question6 {
    public static void main(String[] args) {
        int totalRows = 10;
        for (int row = 1; row <= totalRows; row ++ ){
            for (int column = 1; column <= row; column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
