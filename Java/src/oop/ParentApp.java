package oop;

public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.nama = "Bayu";
        child.doIt();

        Parent parent = (Parent) child;
        parent.doIt();
    }
}
