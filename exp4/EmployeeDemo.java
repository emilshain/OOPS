class Employee {
    String name;
    int age;
    String phoneNo;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Officer o = new Officer();
        o.name = "Arun";
        o.age = 28;
        o.phoneNo = "9876543210";
        o.address = "Kochi";
        o.salary = 50000;
        o.specialization = "Cyber Security";

        System.out.println("Officer Details:");
        System.out.println("Name: " + o.name);
        System.out.println("Age: " + o.age);
        System.out.println("PhoneNo: " + o.phoneNo);
        System.out.println("Address: " + o.address);
        System.out.println("Specialization: " + o.specialization);
        o.printSalary();

        Manager m = new Manager();
        m.name = "Ravi";
        m.age = 35;
        m.phoneNo = "9123456780";
        m.address = "Thrissur";
        m.salary = 80000;
        m.department = "Sales";

        System.out.println("\nManager Details:");
        System.out.println("Name: " + m.name);
        System.out.println("Age: " + m.age);
        System.out.println("PhoneNo: " + m.phoneNo);
        System.out.println("Address: " + m.address);
        System.out.println("Department: " + m.department);
        m.printSalary();
    }
}
