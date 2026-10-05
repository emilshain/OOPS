package pkg1;

public class ClassB {
    public void access() {
        ClassA a = new ClassA();

        System.out.println("Inside pkg1.ClassB:");
        System.out.println("Public    = " + a.pub);
        System.out.println("Protected = " + a.pro);
        System.out.println("Default   = " + a.def);
        System.out.println("Private is not accessible");
    }
}
