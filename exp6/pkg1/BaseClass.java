package pkg1;

public class BaseClass {
    private int pri_n = 10;
    int def_n = 20; // default (package-private)
    protected int pro_n = 30;
    public int pub_n = 40;

    public void display() {
        System.out.println("--- Inside BaseClass (Same Class) ---");
        System.out.println("private pri_n = " + pri_n);
        System.out.println("default def_n = " + def_n);
        System.out.println("protected pro_n = " + pro_n);
        System.out.println("public pub_n = " + pub_n);
    }
}
