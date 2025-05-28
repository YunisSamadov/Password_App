package exercise1.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input password and If you want invisible version please click special character end of your password like this '#'");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Password password = new Password();
        password.setPassword(input);



    }

}
