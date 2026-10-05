import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

        sc.close();
    }
}
