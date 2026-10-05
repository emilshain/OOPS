public class Excep {
    public void check() throws ArithmeticException {
        int a;
        a = 10 / 5;
        System.out.println("a = " + a);
    }

    public void check1() throws ArithmeticException {
        int b;
        b = 25 / 0;
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Excep e = new Excep();
        try {
            e.check();
            e.check1();
        } catch (ArithmeticException ae) {
            System.out.println("Error occurred: " + ae);
        } finally {
            System.out.println("This statement is executed");
        }
    }
}
