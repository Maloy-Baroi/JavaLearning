import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Profile {
    int ID;
    String name;
    String phone;
    String dOb;

    abstract boolean validPhone();
}

class Student extends Profile {

    int ID;
    String name;
    String phone;
    String dOb;

    Student (int iD, String name, String phone, String dOb) {
        this.ID = iD;
        this.name = name;
        this.phone = phone;
        this.dOb = dOb;
    }
    boolean validPhone() {
        String bdPhoneRegex = "^\\+?(88)01[3-9][0-9]{8}$";
        Pattern pattern = Pattern.compile(bdPhoneRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public void createProfile() {
        if (validPhone()) {
            if (name.length() > 0 && ID > 0 && dOb.length() > 0) {
                System.out.println("Profile Created!!!");
            }
            else {
                System.out.println("Name, Phone or DOB is not wrong.");
            }
        }
        else {
            System.out.println("Invalid Phone Number!!!");
        }
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentID = scanner.nextInt();
        String name = scanner.next();
        String phone = scanner.next();
        String dob = scanner.next();

        Student student = new Student(studentID, name, phone, dob);

        student.createProfile();
    }
}
