package practice;

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }
}

public class inheritancepractice {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Calls the overridden method in Dog class
        myDog.bark();
    }
}