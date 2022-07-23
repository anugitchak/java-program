import java.util.*;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        // butterfly pattern
        // upper case (1st part left hand)
        for (int i = 1; i <= n; i++) {
            // stars print

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces print

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part stars print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower case

        for (int i = n; i >= 1; i--) {
            // stars print

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces print

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part stars print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}