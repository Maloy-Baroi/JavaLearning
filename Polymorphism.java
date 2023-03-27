import java.util.Scanner;

class Calculator {
    public int calculation(int a, int b) {
        return a*b;
    }

    public int calculation(int a) {
        return a*a;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator newObj = new Calculator();
        Scanner scanf = new Scanner(System.in);
        int x = scanf.nextInt();
        int y = scanf.nextInt();
        int square = newObj.calculation(x);
        int multiply = newObj.calculation(x, y);
        System.out.println(square);
        System.out.println(multiply);
    }
}
