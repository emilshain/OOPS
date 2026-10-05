abstract class employee {
    String name;
    int age;
    String phone_no;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class officer extends employee {
    String specialization;
}

class manager extends employee {
    String department;
}

public class EmployeeDemo {
    public static void main(String[] args) {
        officer o = new officer();
        o.name = "Arun";
        o.age = 28;
        o.phone_no = "9876543210";
        o.address = "Kochi";
        o.salary = 50000;
        o.specialization = "Cyber Security";

        System.out.println("Officer Details:");
        System.out.println("Name: " + o.name);
        System.out.println("Age: " + o.age);
        System.out.println("Phone no: " + o.phone_no);
        System.out.println("Address: " + o.address);
        System.out.println("Specialization: " + o.specialization);
        o.printSalary();

        manager m = new manager();
        m.name = "Ravi";
        m.age = 35;
        m.phone_no = "9123456780";
        m.address = "Thrissur";
        m.salary = 80000;
        m.department = "Sales";

        System.out.println("\nManager Details:");
        System.out.println("Name: " + m.name);
        System.out.println("Age: " + m.age);
        System.out.println("Phone no: " + m.phone_no);
        System.out.println("Address: " + m.address);
        System.out.println("Department: " + m.department);
        m.printSalary();
    }
}
