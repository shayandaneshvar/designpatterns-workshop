package ir.ac.kntu.designpatterns.structural.adapter;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple(100);
        appleEater(apple);
        Orange orange = new Orange(10, 10);
        appleEater(new AppleAdapter(orange));
    }

    public static void appleEater(Apple apple) {
        apple.eat(10);
    }
}


