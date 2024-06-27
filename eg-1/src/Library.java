public abstract class Library {
    // Private variables
    private String medium;
    private String technology;
    private int cost;

    // Constructor
    public Library(String medium, String technology, int cost) {
        this.medium = medium;
        this.technology = technology;
        this.cost = cost;
    }

    // Abstract method for user preference
    abstract void userPreference();

    // Regular method for displaying result
    public void display() {
        System.out.println("About " + getMedium());
        System.out.println("Medium: " + getTechnology());
        System.out.println("Cost: $" + getCost());
    }


    // GETTERS
    public String getMedium() {
        return medium;
    }
    public String getTechnology() {
        return technology;
    }

    public int getCost() {
        return cost;
    }
}