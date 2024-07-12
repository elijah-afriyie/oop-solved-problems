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