public class Lecture5Question8 {
    public static void main(String[] args) {
        int currentNumber = 1;
        int totalRows = 10;
        for (int row = 1; row <= totalRows; row ++ ){
            for (int column = 1; column <= row; column++){
                System.out.print(currentNumber+" ");
                currentNumber++;
            }
            System.out.println();
        }
    }
}
