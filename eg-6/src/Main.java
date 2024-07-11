public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Range Rover", "Autobiography", 2024);
        Car car2 = new Car(car1);

        // Print out updated memory addresses
        System.out.println("Memory address of car 1: " + car1);
        System.out.println("Memory address of car 2: " + car2);
        System.out.println();

        // Get attributes of car1
        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        car1.tireConfig();
        System.out.println();

        // Get attributes of car2
        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        car2.tireConfig();
        System.out.println();
    }
}
