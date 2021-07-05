package oop;

public class VicePresident extends Manager{

    VicePresident(String name) {
        super(name);
    }

    @Override
    void sayHello(String name) {
        System.out.println("Hi Vice " + name + "my name is " + this.name);
    }
    
}
