package pkg2;

import pkg1.BaseClass;

public class OtherPackageClass {
    public void display() {
        BaseClass b = new BaseClass();
        System.out.println("\n--- Inside OtherPackageClass (Different Package Non-Subclass: pkg2) ---");
        // System.out.println(b.pri_n); // COMPILE ERROR: pri_n is private
        // System.out.println(b.def_n); // COMPILE ERROR: def_n is package-private
        // System.out.println(b.pro_n); // COMPILE ERROR: pro_n is protected
        
        // Only public members are accessible:
        System.out.println("public pub_n = " + b.pub_n);
    }
}
