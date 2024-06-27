# Vehicle System

This Java program models different types of vehicles using object-oriented programming principles. It includes abstract classes, inheritance, method overriding, and polymorphism to represent different types of vehicles.

## Classes

### Vehicle (Abstract Class)
- **Fields**:
  - `model` (String): Represents the model of the vehicle.
  - `year` (int): Represents the year the vehicle was made.

- **Constructor**:
  - `Vehicle(String model, int year)`: Initializes the fields.

- **Methods**:
  - `abstract void transMode()`: Abstract method to be implemented by subclasses.
  - `void title()`: Prints the vehicle's model and year.
  - Getter methods for `model` and `year`.

### Aircraft (Subclass of Vehicle)
- **Fields**:
  - `tMode` (String): Represents the mode of transportation.

- **Constructor**:
  - `Aircraft(String model, int year, String tMode)`: Initializes all fields, including those from the `Vehicle` class.

- **Methods**:
  - `void transMode()`: Prints the specific mode of transportation (overrides abstract method).

### Ship (Subclass of Vehicle)
- **Fields**:
  - `tMode` (String): Represents the mode of transportation.

- **Constructor**:
  - `Ship(String model, int year, String tMode)`: Initializes all fields, including those from the `Vehicle` class.

- **Methods**:
  - `void transMode()`: Prints the specific mode of transportation (overrides abstract method).

### Car (Subclass of Vehicle)
- **Fields**:
  - `tMode` (String): Represents the mode of transportation.

- **Constructor**:
  - `Car(String model, int year, String tMode)`: Initializes all fields, including those from the `Vehicle` class.

- **Methods**:
  - `void transMode()`: Prints the specific mode of transportation (overrides abstract method).

## Main Class
- **Main**: Contains the `main` method where instances of `Aircraft`, `Ship`, and `Car` are created. It uses the `title()` method to print the details of each vehicle and the `transMode()` method to print the specific transportation mode of each vehicle.

## Example Usage

Instantiate the `Aircraft`, `Ship`, and `Car` classes and call their methods to display information:

```java
public class Main {
    public static void main(String[] args) {
        // Instances of the class
        Vehicle aircraft = new Aircraft("Airbus-414J", 2022, "Air");
        Vehicle ship = new Ship("MEASK-Coastliner-V", 2005, "Sea");
        Vehicle car = new Car("Toyota Land Cruiser", 2024, "Land");

        // Implementations of the class instances
        aircraft.title();
        aircraft.transMode();

        ship.title();
        ship.transMode();

        car.title();
        car.transMode();
    }
}
```

### Example Output

The program should produce output similar to the following when run:

```
Manifest ==> Model: Airbus-414J -::- Year: 2022
Transportation mode: Air

Manifest ==> Model: MEASK-Coastliner-V -::- Year: 2005
Transportation mode: Sea

Manifest ==> Model: Toyota Land Cruiser -::- Year: 2024
Transportation mode: Land
```
