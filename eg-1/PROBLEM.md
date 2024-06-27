You are tasked with designing a system that represents different types of media storage technologies. The system should use object-oriented principles such as abstraction, inheritance, and method overriding. You will create an abstract class and several subclasses that inherit from it.

1. **Abstract Class Design**:
   - Create an abstract class named `Library` with the following private fields: `medium` (String), `technology` (String), and `cost` (int).
   - Implement a constructor in `Library` that initializes these fields.
   - Define an abstract method `userPreference()` in `Library`.
   - Implement a regular method `display()` that prints the details of the medium (i.e., `medium`, `technology`, and `cost`).
   - Provide getter methods for the private fields in `Library`.

2. **Subclass Implementations**:
   - Create three subclasses of `Library`: `Magazine`, `FlashDrive`, and `Vhs`.
   - Each subclass should have an additional private field `favBrand` (String) and a constructor that initializes all fields including the ones from `Library`.
   - Implement the `userPreference()` method in each subclass to print a specific message that includes the favorite brand.

3. **Main Class Implementation**:
   - In the `Main` class, create instances of `Magazine`, `FlashDrive`, and `Vhs`.
   - Use the `display()` method to print the details of each medium.
   - Use the `userPreference()` method to print the user preference for each type of medium.

### Requirements:
- Ensure that the program demonstrates inheritance and method overriding.
- Each subclass should provide its own implementation of the `userPreference()` method.
- The `display()` method should be used to print the common details of the media, while the `userPreference()` method should print the specific details.

### Example Output:
Your program should produce output similar to the following when run:

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

By following these instructions, you should be able to implement a system that adheres to the principles of object-oriented programming.
