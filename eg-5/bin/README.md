```markdown
# Vehicle and Car Classes in Java

## Overview

This project demonstrates the use of an abstract class to define a generic behavior for all vehicles, and a `Car` class that extends this abstract class. The `Car` class includes methods for setting and getting its attributes, as well as a method to copy the properties from another `Car` object.

## Classes

### `Vehicle` Class

This is an abstract class that defines a generic behavior for all vehicles.

```java
public abstract class Vehicle {
    public abstract void move();
}
```

### `Car` Class

This class extends the `Vehicle` class and implements the `move` method. It also includes attributes for the car's name, make, and year, along with getters, setters, and a copy method.

```java
public class Car extends Vehicle {
    private String name;
    private String make;
    private int year;

    Car(String name, String make, int year) {
        this.setName(name);
        this.setMake(make);
        this.setYear(year);
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Copy method
    public void copy(Car car) {
        this.setName(car.getName());
        this.setMake(car.getMake());
        this.setYear(car.getYear());
    }
}
```

### `Main` Class

This class contains the `main` method, which demonstrates creating instances of the `Car` class, printing their attributes before and after using the copy method.

```java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Model S", "Tesla", 2022);
        Car car2 = new Car("Mustang", "Ford", 2020);

        System.out.println("Before copy:");
        System.out.println("Car 1: " + car1.getName() + ", " + car1.getMake() + ", " + car1.getYear());
        System.out.println("Car 2: " + car2.getName() + ", " + car2.getMake() + ", " + car2.getYear());

        car1.copy(car2);

        System.out.println("After copy:");
        System.out.println("Car 1: " + car1.getName() + ", " + car1.getMake() + ", " + car1.getYear());
    }
}
```

## How to Run

1. Compile the Java files:
   ```sh
   javac Vehicle.java Car.java Main.java
   ```

2. Run the `Main` class:
   ```sh
   java Main
   ```

## Expected Output

```
Before copy:
Car 1: Model S, Tesla, 2022
Car 2: Mustang, Ford, 2020
After copy:
Car 1: Mustang, Ford, 2020
```

This output shows the attributes of `car1` before and after the copy method is called, demonstrating that `car1`'s attributes are updated to match those of `car2`.
```