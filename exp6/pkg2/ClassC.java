package pkg2;

import pkg1.ClassA;

public class ClassC {
    public void access() {
        ClassA a = new ClassA();

        System.out.println("Inside pkg2.ClassC:");
        System.out.println("Public = " + a.pub);
        System.out.println("Protected, default and private members are not accessible");
    }
}
