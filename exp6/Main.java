import pkg1.BaseClass;
import pkg1.SamePackageClass;
import pkg2.SubClass;
import pkg2.OtherPackageClass;

public class Main {
    public static void main(String[] args) {
        // 1. Same Class
        BaseClass base = new BaseClass();
        base.display();

        // 2. Same Package (Non-subclass)
        SamePackageClass samePkg = new SamePackageClass();
        samePkg.display();

        // 3. Different Package (Subclass)
        SubClass sub = new SubClass();
        sub.display();

        // 4. Different Package (Non-subclass)
        OtherPackageClass otherPkg = new OtherPackageClass();
        otherPkg.display();
    }
}
