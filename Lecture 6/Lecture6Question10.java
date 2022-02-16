import java.util.Scanner;
public class Lecture6Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int half = sc.nextInt();
        boolean reverse = false;
        int row = 1;
        while (row > 0){
            for (int column = 1; column <= half * 2; column++){
                if (column <= row || column > (half * 2) - row){System.out.print("*");}
                else{System.out.print(" ");}}
            System.out.println();
            if (row == half){reverse = true;}
            if (reverse == true){row--;}
            else{row++;}
        }
    }
}
