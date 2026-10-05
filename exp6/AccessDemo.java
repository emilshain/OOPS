import pkg1.ClassA;
import pkg1.ClassB;
import pkg2.ClassC;

public class AccessDemo {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.show();

        System.out.println();

        ClassB b = new ClassB();
        b.access();

        System.out.println();

        ClassC c = new ClassC();
        c.access();
    }
}
