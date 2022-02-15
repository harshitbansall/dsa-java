public class Lecture5Question7 {
    public static void main(String[] args) {
        int totalRows = 9;
        for (int row = 1; row <= totalRows; row ++ ){
            for (int column = 1; column <= totalRows-row; column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
