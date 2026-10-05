import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to find frequency: ");
        char ch = sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of " + ch + " = " + count);

        sc.close();
    }
}
