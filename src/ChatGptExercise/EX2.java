package ChatGptExercise;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        int x;
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter a number ");
       x = input.nextInt();
       while (x!=0) {
           System.out.println("Please enter a number ");
           x = input.nextInt();


       }
    }
}
