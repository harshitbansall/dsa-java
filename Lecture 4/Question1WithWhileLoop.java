import java.util.Scanner;

public class Question1WithWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopNum = sc.nextInt();
        int i = 0;
        while(i<loopNum){
            System.out.println(i);
            i+=1;
        }
    }
}
