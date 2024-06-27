public class FlashDrive extends Library {
    // Field
    private String favBrand;

    // Constructor
    public FlashDrive(String medium, String technology, int cost, String favBrand) {
        super(medium, technology, cost);
        this.favBrand = favBrand;
    }

    // Implementation of carried over abstract method
    public void userPreference() {
        System.out.println("Flash drives are the current device everyone is using. My favorite brand is " + getFavBrand());
    }

    // Getter
    public String getFavBrand() {
        return favBrand;
    }
}