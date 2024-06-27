public class Magazine extends Library {
    // Field
    private String favBrand;

    // Constructor
    public Magazine(String medium, String technology, int cost, String favBrand) {
        super(medium, technology, cost);
        this.favBrand = favBrand;
    }

    // Implementation of carried over abstract method
    public void userPreference() {
        System.out.println("I love reading magazines. My favorite publisher is " + getFavBrand());
    }

    // Getter
    public String getFavBrand() {
        return favBrand;
    }
}