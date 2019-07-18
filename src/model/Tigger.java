package model;
/**
 * Created by FL8000 on 2019/7/17.
 */
class Animal {
    public int age;
    public double weight;

    public Animal() {
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void run() {
        System.out.println("I can run!");
    }

    public void eat() {
        System.out.println("I can eat!");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

class Cat extends Animal {
    public Cat(int age, double weight) {
        super(age, weight);
    }

    public void sound() {
        System.out.println("喵喵叫");
    }
}

public class Tigger extends Cat {
    public Tigger(int age, double weight) {
        super(age, weight);
    }

    public static void main(String[] args) {
        Tigger tigger = new Tigger(5, 20.0d);
        tigger.sound();
    }
}