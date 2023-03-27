import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int x;
        float y;
        try {
            x = scanf.nextInt();
            y = Float.parseFloat(scanf.next());
            System.out.println(x*y);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
