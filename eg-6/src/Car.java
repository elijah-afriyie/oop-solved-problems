public class Car extends Vehicle {
    // Private fields
    private String name;
    private String model;
    private int year;

    // Constructor
    public Car(String name, String model, int year) {
        this.setName(name);
        this.setModel(model);
        this.setYear(year);
    }

    // Car copy constructor
    public Car(Car car) {
        this.copy(car);
    }

    // Implementation of inherited method
    public void tireConfig() {
        System.out.println("This car has 4 tires");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Copy method
    public void copy(Car car) {
        this.setName(car.getName());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }
}