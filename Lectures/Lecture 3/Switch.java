import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = sc.nextLine();
        switch (text){
            case "hello world":System.out.println("ok");
            break;
            case "wth":System.out.println("What the hell");
            break;
            case "gth":System.out.println("Go to Hell");
            break;
            default :  System.out.println("Invalid String.");
        }
    }
}
