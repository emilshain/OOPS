import java.util.Scanner;

class VotingException extends Exception {
    VotingException(String message) {
        super(message);
    }
}

public class VoteDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new VotingException("Not eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
        } catch (VotingException ve) {
            System.out.println("Exception caught: " + ve.getMessage());
        } finally {
            System.out.println("Thank you for using the program");
        }

        sc.close();
    }
}
