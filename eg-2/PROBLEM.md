You are tasked with creating a Java program that models different types of vehicles. The program should use object-oriented programming principles to ensure it is well-structured, flexible, and reusable.

1. **Create a Base Class for Vehicles**:
   - Design an abstract class named `Vehicle` with the common properties that all vehicles share, such as `model` (String) and `year` (int).
   - Implement a constructor in `Vehicle` to initialize these properties.
   - Define an abstract method `transMode()` in `Vehicle` to represent the mode of transportation.
   - Implement a regular method `title()` that prints the vehicle's model and year.
   - Provide getter methods for the `model` and `year` properties.

2. **Subclass Implementation**:
   - Create three subclasses of `Vehicle`: `Aircraft`, `Ship`, and `Car`.
   - Each subclass should have an additional property `tMode` (String) to specify the mode of transportation.
   - Implement a constructor in each subclass to initialize all properties, including those from `Vehicle`.
   - Override the `transMode()` method in each subclass to print the specific mode of transportation.
   
3. **Object Creation and Testing**:
   - In the `Main` class, create instances of `Aircraft`, `Ship`, and `Car`.
   - Use the `title()` method to print the details of each vehicle.
   - Use the `transMode()` method to print the specific transportation mode of each vehicle.

### Requirements:
- Ensure the program demonstrates the use of inheritance and method overriding.
- Each subclass should provide its own implementation of the `transMode()` method.
- The `title()` method should be used to print the common details of the vehicles, while the `transMode()` method should print the specific details.

### Example Output:
Your program should produce output similar to the following when run:

```
Manifest ==> Model: Airbus-414J -::- Year: 2022
Transportation mode: Air

Manifest ==> Model: MEASK-Coastliner-V -::- Year: 2005
Transportation mode: Sea

Manifest ==> Model: Toyota Land Cruiser -::- Year: 2024
Transportation mode: Land
```

By following these instructions, you should be able to implement a system that adheres to the principles of object-oriented programming and demonstrates the use of abstract classes, inheritance, and polymorphism.
