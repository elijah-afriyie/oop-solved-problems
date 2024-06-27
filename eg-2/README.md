# Vehicle System

This Java program models a vehicle system using object-oriented programming principles. It includes abstract classes, inheritance, method overriding, and polymorphism to represent different types of vehicles.

## Classes

### Vehicle (Abstract Class)

- **Fields**: `model` (String), `year` (int)
- **Methods**:
  - `Vehicle(String model, int year)` - Constructor
  - `abstract void transMode()` - Abstract method to be implemented by subclasses
  - `void title()` - Prints the model and year of the vehicle
  - `String getModel()` - Returns the model of the vehicle
  - `int getYear()` - Returns the year of the vehicle

### Aircraft (Subclass of Vehicle)

- **Fields**: `tMode` (String)
- **Methods**:
  - `Aircraft(String model, int year, String tMode)` - Constructor
  - `void transMode()` - Prints the transportation mode (overrides abstract method)

### Ship (Subclass of Vehicle)

- **Fields**: `tMode` (String)
- **Methods**:
  - `Ship(String model, int year, String tMode)` - Constructor
  - `void transMode()` - Prints the transportation mode (overrides abstract method)

### Car (Subclass of Vehicle)

- **Fields**: `tMode` (String)
- **Methods**:
  - `Car(String model, int year, String tMode)` - Constructor
  - `void transMode()` - Prints the transportation mode (overrides abstract method)

## Usage

Instantiate the `Aircraft`, `Ship`, and `Car` classes and call their methods to display information:

```java
public class Main {
    public static void main(String[] args) {
        Vehicle aircraft = new Aircraft("Airbus-414J", 2022, "Air");
        Vehicle ship = new Ship("MEASK-Coastliner-V", 2005, "Sea");
        Vehicle car = new Car("Toyota Land Cruiser", 2024, "Land");

        aircraft.title();
        aircraft.transMode();

        ship.title();
        ship.transMode();

        car.title();
        car.transMode();
    }
}
```
