/*
18. Inheritance Example
• Objective: Implement inheritance.
• Task: Create a base class Animal and a subclass Dog.
• Instructions:
o Animal class should have a method makeSound().
o Dog class should override makeSound() to print "Bark".
o Instantiate both classes and call their methods.
*/
class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass inheriting Animal
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();


        Dog d = new Dog();
        d.makeSound();
    }
}