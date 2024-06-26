public abstract class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    abstract void transMode();

    public void title() {
        System.out.println("Manifest ==> Model: " + getModel() + " -::- Year: " + getYear());
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
