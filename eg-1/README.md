# Media Storage Technologies System

This Java program models different types of media storage technologies using object-oriented programming principles such as abstraction, inheritance, and method overriding. The program includes an abstract class and several subclasses to represent various media storage types.

## Classes

### Library (Abstract Class)
- **Fields**:
  - `medium` (String): Represents the type of medium.
  - `technology` (String): Represents the technology used by the medium.
  - `cost` (int): Represents the cost of the medium.

- **Constructor**:
  - `Library(String medium, String technology, int cost)`: Initializes the fields.

- **Methods**:
  - `abstract void userPreference()`: Abstract method to be implemented by subclasses.
  - `void display()`: Prints the details of the medium.
  - Getter methods for `medium`, `technology`, and `cost`.

### Magazine (Subclass of Library)
- **Fields**:
  - `favBrand` (String): Represents the favorite brand of the magazine.

- **Constructor**:
  - `Magazine(String medium, String technology, int cost, String favBrand)`: Initializes all fields including those from the `Library` class.

- **Methods**:
  - `void userPreference()`: Prints a specific message that includes the favorite brand.

### FlashDrive (Subclass of Library)
- **Fields**:
  - `favBrand` (String): Represents the favorite brand of the flash drive.

- **Constructor**:
  - `FlashDrive(String medium, String technology, int cost, String favBrand)`: Initializes all fields including those from the `Library` class.

- **Methods**:
  - `void userPreference()`: Prints a specific message that includes the favorite brand.

### Vhs (Subclass of Library)
- **Fields**:
  - `favBrand` (String): Represents the favorite brand of the VHS.

- **Constructor**:
  - `Vhs(String medium, String technology, int cost, String favBrand)`: Initializes all fields including those from the `Library` class.

- **Methods**:
  - `void userPreference()`: Prints a specific message that includes the favorite brand.

## Main Class
- **Main**: Contains the `main` method where instances of `Magazine`, `FlashDrive`, and `Vhs` are created. It uses the `display()` method to print the details of each medium and the `userPreference()` method to print the user preference for each type of medium.

## Example Usage

Instantiate the `Magazine`, `FlashDrive`, and `Vhs` classes and call their methods to display information:

```java
public class Main {
    public static void main(String[] args) {
        // Instances of the class
        Library magazine = new Magazine("Magazines", "Analog", 20, "Glade Garnet");
        Library flashDrive = new FlashDrive("Flash drives", "Digital", 137, "SanDisk");
        Library vhs = new Vhs("VHS records", "Digital", 48, "Philips");

        // Implementations of the class instances
        magazine.display();
        magazine.userPreference();

        flashDrive.display();
        flashDrive.userPreference();

        vhs.display();
        vhs.userPreference();
    }
}
```

### Example Output

The program should produce output similar to the following when run:

```
About Magazines
Medium: Analog
Cost: $20
I love reading magazines. My favorite publisher is Glade Garnet

About Flash drives
Medium: Digital
Cost: $137
Flash drives are the current device everyone is using. My favorite brand is SanDisk

About VHS records
Medium: Digital
Cost: $48
VHS tapes are now obsolete. However, my favorite manufacturer back then was Philips
```
