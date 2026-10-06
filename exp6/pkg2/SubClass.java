package pkg2;

import pkg1.BaseClass;

public class SubClass extends BaseClass {
    public void display() {
        System.out.println("\n--- Inside SubClass (Different Package Subclass: pkg2) ---");
        // System.out.println(pri_n); // COMPILE ERROR: pri_n is private
        // System.out.println(def_n); // COMPILE ERROR: def_n is package-private
        
        // Accessible via inheritance:
        System.out.println("protected pro_n = " + pro_n);
        System.out.println("public pub_n = " + pub_n);
    }
}
