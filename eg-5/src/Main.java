public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Range Rover", "Autobiography", 2024);
        Car car2 = new Car("Land Cruiser", "76 Series", 2024);

        // Print out original memory addresses
        System.out.println("Original memory address of car 1: " + car1);
        System.out.println("Original memory address of car 2: " + car2);
        System.out.println();

        // Copy car1 to car2
        // car2.copy(car1);

        // Print out updated memory addresses
        System.out.println("Updated memory address of car 1: " + car1);
        System.out.println("Updated memory address of car 2: " + car2);
        System.out.println();

        // Get attributes of car1
        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();

        // Get attributes of car2
        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
