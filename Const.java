package oop;

public class Const {
    int id;
    String name;

    Const() {
        id = 101;
        name = "Aman";
    }

    void logic() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Const p1 = new Const();
        p1.logic();
    }
}
