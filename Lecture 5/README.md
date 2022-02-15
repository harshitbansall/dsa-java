# [Lecture 5](https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=5)
## Question 1 - Solid Rectangle
```java
  public class Lecture5Question1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            for (int k = 1; k <= 5; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
```
## Question 2 - Hollow Rectangle
```java
public class Lecture5Question2 {
    public static void main(String[] args) {
        int columns = 10;
        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= columns; k++) {
                if (i == 1 || i == rows || k == 1 || k == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
```
