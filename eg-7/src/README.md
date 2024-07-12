# Dynamic Polymorphism Example

This project demonstrates the use of dynamic polymorphism in Java to handle different behaviors of objects at runtime.

## Classes

### Animal

```java
import javax.swing.JOptionPane;

public class Animal {
    public void speak() {
        JOptionPane.showMessageDialog(null, "You've selected an invalid option!*");
    }
}
```

The `Animal` class serves as the base class with a method `speak()` that displays a default message for an invalid option.

### Dog

```java
import javax.swing.JOptionPane;

public class Dog extends Animal {
    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "Dog goes *Woff Woff!*");
    }
}
```

The `Dog` class extends `Animal` and overrides the `speak()` method to display a message specific to dogs.

### Cat

```java
import javax.swing.JOptionPane;

public class Cat extends Animal {
    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "Cat goes *Meow Meow!*");
    }
}
```

The `Cat` class extends `Animal` and overrides the `speak()` method to display a message specific to cats.

### Main

```java
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Select your favorite Animal\n1. Dog\n2. Cat"));
        
        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            animal.speak();
        }
    }
}
```

The `Main` class prompts the user to select their favorite animal (either Dog or Cat) using `JOptionPane`. Based on the user's choice, it instantiates the appropriate subclass and calls the `speak()` method to display the corresponding animal sound. If an invalid option is selected, it defaults to the base class `Animal`.

## How to Run

1. Compile all the classes using `javac`.
    ```bash
    javac Animal.java Dog.java Cat.java Main.java
    ```

2. Run the `Main` class.
    ```bash
    java Main
    ```

3. A dialog box will prompt you to select your favorite animal (1 for Dog, 2 for Cat). Depending on your choice, the corresponding animal sound will be displayed. If an invalid option is selected, a default message will be shown.