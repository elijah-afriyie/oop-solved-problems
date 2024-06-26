public class Ship extends Vehicle {
    private String tMode;

    public Ship(String model, int year, String tMode) {
        super(model, year);
        this.tMode = tMode;
    }

    public void transMode() {
        System.out.println("Transportation mode: " + tMode);
    }
}
