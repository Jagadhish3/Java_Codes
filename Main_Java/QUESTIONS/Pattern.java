import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int n=11;
        int spaces=n/2;
        int stars=1;

        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        spaces = 1;
        stars = n - 2;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}
