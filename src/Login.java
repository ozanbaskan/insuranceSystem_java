import java.util.Scanner;

public class Login {
    private static Scanner s = new Scanner(System.in);
    private String email;
    private String password;


    public void login()
    {
        System.out.print("Email adresinizi giriniz: ");
        this.email = s.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        this.password = s.nextLine();
    }

    public static Scanner getS() {
        return s;
    }

    public static void setS(Scanner s) {
        Login.s = s;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
