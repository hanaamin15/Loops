package ChatGptExercise;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        int password;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        password = input.nextInt();
        do {
            System.out.println("Please enter your password");
            password = input.nextInt();
        } while (password!=1234);

    }
}
