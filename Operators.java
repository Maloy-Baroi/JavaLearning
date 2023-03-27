import java.util.Scanner;

public class Operators {
    protected static Scanner scanner = new Scanner(System.in);

    public static void summarizer(int x, int y) {
        System.out.println(x+y);
    }

    public static void main(LearnString[] args) {
        int num1, num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("Operation? (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            summarizer(num1, num2);
        }
        else if (operation == '-') {
            if (num1 > num2) {
                System.out.println(num1 - num2);
            } else {
                System.out.println(num2 - num1);
            }
        }
        else if (operation == '*') {
            System.out.println(num1*num2);
        }
        else if (operation == '/') {
            System.out.println(num1/num2);
        }
    }
}
