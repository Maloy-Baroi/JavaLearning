import java.util.Scanner;

class NewClass {
    public int sumReturn(int x, int y) {
        return x+y;
    }

    public int sumReturn(int x, int y, int z) {
        return x+(y*2)+z;
    }
}

public class MethodOverloading {
    public static void main(LearnString[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        NewClass cls = new NewClass();
        int result = cls.sumReturn(a, b);
        int result1 = cls.sumReturn(a, b, scanner.nextInt());
        System.out.println(result);
        System.out.println(result1);
    }
}

