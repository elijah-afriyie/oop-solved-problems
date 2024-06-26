public class Car extends Vehicle {
    private String tMode;

    public Car(String model, int year, String tMode) {
        super(model, year);
        this.tMode = tMode;
    }

    public void transMode() {
        System.out.println("Transportation mode: " + tMode);
    }
}
