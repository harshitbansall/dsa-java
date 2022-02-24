import java.util.*;
public class Lecture7Question1 {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        printMyName(sc.nextLine());
    }
}