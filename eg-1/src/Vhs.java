public class Vhs extends Library {
    // Field
    private String favBrand;

    // Constructor
    public Vhs(String medium, String technology, int cost, String favBrand) {
        super(medium, technology, cost);
        this.favBrand = favBrand;
    }

    // Implementation of carried over abstract method
    public void userPreference() {
        System.out.println("VHS tapes are now obsolete. However, my favorite manufacturer back then was " + getFavBrand());
    }

    // Getter
    public String getFavBrand() {
        return favBrand;
    }
}