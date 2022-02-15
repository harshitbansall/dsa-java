public class Lecture5Question5 {
    public static void main(String[] args) {
        int totalRows = 10;
        for (int row = 0; row <= totalRows-1; row ++ ){
            for (int column = 0; column <= totalRows-1; column++){
                if (column >= totalRows-1-row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
