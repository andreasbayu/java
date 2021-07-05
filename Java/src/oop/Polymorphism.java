package oop;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Bayu");
        employee.sayHello("Budi");

        employee = new Manager("Bayu");
        employee.sayHello("Budi");

        employee = new VicePresident("Bayu");
        employee.sayHello("Budi");

        sayHello(new Employee("Employee"));
        sayHello(new VicePresident("VicePresident"));
        sayHello(new Manager("Manager"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            // type chech & cast
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("hi employee " + vicePresident.name);
        } else if (employee instanceof Manager) {
            // casting bukan tipe data primitif
            Manager manager = (Manager) employee;
            System.out.println("hi Manager " + manager.name);
        } else {
            System.out.println("hi " + employee.name);
        }
    }
}
