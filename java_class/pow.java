import java.util.Scanner;

public class pow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Odd n gives better-looking letters
        if (n < 5 || n % 2 == 0) {
            System.out.println("Enter an odd number >= 5");
            return;
        }

        for (int i = 0; i < n; i++) {

            // S
            for (int j = 0; j < n; j++) {

                if (i == 0 ||
                    i == n / 2 ||
                    i == n - 1 ||
                    (j == 0 && i < n / 2) ||
                    (j == n - 1 && i > n / 2)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            // A
            for (int j = 0; j < n; j++) {

                if ((i == 0 && j > 0 && j < n - 1) ||
                    i == n / 2 ||
                    (j == 0 && i > 0) ||
                    (j == n - 1 && i > 0)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            // B
            for (int j = 0; j < n; j++) {

                if (j == 0 ||
                    i == 0 ||
                    i == n / 2 ||
                    i == n - 1 || 
                    j==0|| j==n-1
                    ) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            // A
            for (int j = 0; j < n; j++) {

                if ((i == 0 && j > 0 && j < n - 1) ||
                    i == n / 2 ||
                    (j == 0 && i > 0) ||
                    (j == n - 1 && i > 0)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            // R
            for (int j = 0; j < n; j++) {

                if (j == 0 ||
                    i == 0 ||
                    i == n / 2 ||
                    (j == n - 1 && i <= n / 2) ||
                    (i > n / 2 &&
                     j == i - n / 2)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            // E
            for (int j = 0; j < n; j++) {

                if (j == 0 ||
                    i == 0 ||
                    i == n / 2 ||
                    i == n - 1) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            // E
            for (int j = 0; j < n; j++) {

                if (j == 0 ||
                    i == 0 ||
                    i == n / 2 ||
                    i == n - 1) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            // S
            for (int j = 0; j < n; j++) {

                if (i == 0 ||
                    i == n / 2 ||
                    i == n - 1 ||
                    (j == 0 && i < n / 2) ||
                    (j == n - 1 && i > n / 2)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            // H
            for (int j = 0; j < n; j++) {

                if (j == 0 ||
                    j == n - 1 ||
                    i == n / 2) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}