import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User {
    String email;
    String password;

    User(String E, String P) {
        this.email = E;
        this.password = P;
    }

    void showPassword() {
        System.out.println(password);
    }

    protected boolean login() {
        return email.length() > 0 && password.length() > 0;
    }
}

class Verification extends User {

    String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$";

    Verification(String E, String P) {
        super(E, P);
    }

    public boolean isValid(String email) {
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String inputEmail = scanf.next();
        String inputPassword = scanf.next();
        Verification veriObject = new Verification(inputEmail, inputPassword);
        if (veriObject.isValid(inputEmail)) {
            if (veriObject.login()){
                System.out.println("Logged In!!!");
            }
            else {
                System.out.println("Login Failed!!!");
            }
        }
        else {
            System.out.println("Email is not valid!!!");
        }
    }
}
