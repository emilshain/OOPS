package pkg1;

public class SamePackageClass {
    public void display() {
        BaseClass b = new BaseClass();
        System.out.println("\n--- Inside SamePackageClass (Same Package: pkg1) ---");
        // System.out.println(b.pri_n); // COMPILE ERROR: pri_n is private
        System.out.println("default def_n = " + b.def_n);
        System.out.println("protected pro_n = " + b.pro_n);
        System.out.println("public pub_n = " + b.pub_n);
    }
}
