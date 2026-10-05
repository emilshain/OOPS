package pkg1;

public class ClassA {
    public int pub = 10;
    protected int pro = 20;
    int def = 30;
    private int pri = 40;

    public void show() {
        System.out.println("Inside pkg1.ClassA:");
        System.out.println("Public    = " + pub);
        System.out.println("Protected = " + pro);
        System.out.println("Default   = " + def);
        System.out.println("Private   = " + pri);
    }
}
