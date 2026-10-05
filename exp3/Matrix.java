import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1, c1, r2, c2, i, j, k;

        System.out.print("Enter rows and columns of first matrix: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible");
            sc.close();
            return;
        }

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] c = new int[r1][c2];

        System.out.println("Enter elements of first matrix:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                c[i][j] = 0;
                for (k = 0; k < c1; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resultant matrix:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
