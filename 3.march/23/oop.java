/**
 * Demonstrates all OOP concepts: Encapsulation, Inheritance, Polymorphism, and Abstraction.
 */
abstract class Animal { // Abstraction
    private String name; // Encapsulation

    public Animal(String name) {
        this.name = name;
    }

    public String getName() { // Encapsulation
        return name;
    }

    public void setName(String name) { // Encapsulation
        this.name = name;
    }

    public abstract void makeSound(); // Abstraction
}

class Dog extends Animal { // Inheritance
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() { // Polymorphism (Method Overriding)
        System.out.println(getName() + " says Woof!");
    }

    public void fetch() { // Additional method for Dog
        System.out.println(getName() + " is fetching the ball!");
    }
}

class Cat extends Animal { // Inheritance
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() { // Polymorphism (Method Overriding)
        System.out.println(getName() + " says Meow!");
    }

    public void scratch() { // Additional method for Cat
        System.out.println(getName() + " is scratching the furniture!");
    }
}

interface Pet { // Interface
    void play();
}

class Parrot extends Animal implements Pet { // Inheritance and Interface Implementation
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() { // Polymorphism (Method Overriding)
        System.out.println(getName() + " says Squawk!");
    }

    @Override
    public void play() { // Interface Method Implementation
        System.out.println(getName() + " is playing with a toy!");
    }
}

public class oop {
    public static void main(String[] args) {
        // Polymorphism (Upcasting)
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Kitty");
        Animal parrot = new Parrot("Polly");

        dog.makeSound();
        cat.makeSound();
        parrot.makeSound();

        // Downcasting to access specific methods
        if (dog instanceof Dog) {
            ((Dog) dog).fetch();
        }

        if (cat instanceof Cat) {
            ((Cat) cat).scratch();
        }

        if (parrot instanceof Parrot) {
            ((Parrot) parrot).play();
        }
    }
}
