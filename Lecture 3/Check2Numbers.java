import java.util.Scanner;
public class Check2Numbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNum = sc.nextInt();
        if (firstNum > secondNum){
            System.out.println(firstNum + " is Greater.");
        }
        else if(firstNum < secondNum) {
            System.out.println(secondNum + " is Greater.");
        }
        else {
            System.out.println("Both Are Equal.");
        }
    }
}
