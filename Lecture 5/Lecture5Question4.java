public class Lecture5Question4 {
    public static void main(String[] args) {
        int totalRows = 10;
        for (int row = totalRows; row >= 1; row -- ){
            for (int column = 1; column <= row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
