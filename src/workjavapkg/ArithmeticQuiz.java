package workjavapkg;

import java.util.Scanner;
import java.util.Random;

public class ArithmeticQuiz {
    public static void main(String[] args) {
        int aaa, bbb, total, ans;
        int iii;
        int ccc = new Random().nextInt(90) + 10;
        int ddd = new Random().nextInt(90) + 10;
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("*******Welcome to the Arithmetic quiz********");
            System.out.println("MENU:\n\nEnter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 to Exit\n");
            iii = scanner.nextInt();
            
            if (iii == 1) {
                aaa = new Random().nextInt(90) + 10;
                bbb = new Random().nextInt(90) + 10;
                System.out.println("How much is " + aaa + " plus " + bbb + "?");
                System.out.print("Enter your answer (-1 to return to menu): ");
                ans = scanner.nextInt();
                total = aaa + bbb;
                while (ans != -1 && ans != total) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + aaa + " plus " + bbb + "?");
                    System.out.print("Enter your answer (-1 to return to menu): ");
                    ans = scanner.nextInt();
                }
                if (ans != -1) {
                    System.out.println("Very Good!");
                }
            } else if (iii == 2) {
                aaa = new Random().nextInt(90) + 10;
                bbb = new Random().nextInt(90) + 10;
                System.out.println("How much is " + aaa + " minus " + bbb + "?");
                System.out.print("Enter your answer (-1 to return to menu): ");
                ans = scanner.nextInt();
                total = aaa - bbb;
                while (ans != -1 && ans != total) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + aaa + " minus " + bbb + "?");
                    System.out.print("Enter your answer (-1 to return to menu): ");
                    ans = scanner.nextInt();
                }
                if (ans != -1) {
                    System.out.println("Very Good!");
                }
            } else if (iii == 3) {
                aaa = new Random().nextInt(90) + 10;
                bbb = new Random().nextInt(90) + 10;
                System.out.println("How much is " + aaa + " times " + bbb + "?");
                System.out.print("Enter your answer (-1 to return to menu): ");
                ans = scanner.nextInt();
                total = aaa * bbb;
                while (ans != -1 && ans != total) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + aaa + " times " + bbb + "?");
                    System.out.print("Enter your answer (-1 to return to menu): ");
                    ans = scanner.nextInt();
                }
                if (ans != -1) {
                    System.out.println("Very Good!");
                }
            } else if (iii == 4) {
                aaa = new Random().nextInt(90) + 10;
                bbb = new Random().nextInt(90) + 10;
                System.out.println("How much is " + aaa + " divided by " + bbb + "?");
                System.out.print("Enter your answer (-1 to return to menu): ");
                ans = scanner.nextInt();
                total = aaa / bbb;
                while (ans != -1 && ans != total) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + aaa + " divided by " + bbb + "?");
                    System.out.print("Enter your answer (-1 to return to menu): ");
                    ans = scanner.nextInt();
                }
                if (ans != -1) {
                    System.out.println("Very Good!");
                }
            }
        } while (iii != 5);

        scanner.close();
    }
}
