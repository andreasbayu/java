package oop;

class Parent {
    String nama;
    void doIt() {
        System.out.println("Do it in parent");
    }
}
class Child extends Parent{
    String nama;
    void doIt() {
        System.out.println("Do it in child");
    }
}