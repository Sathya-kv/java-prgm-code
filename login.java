import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "12345";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String user = sc.nextLine();
        System.out.println("Enter password");
        String pass = sc.nextLine();
        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login successfull");
        } else {
            System.out.println("Invalid credentails");
        }
    }
}