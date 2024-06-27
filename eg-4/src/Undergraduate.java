public class Undergraduate extends Student {
    // Private field
    private int creditHours;
    private int tuition;

    // Constructor
    public Undergraduate(String studentName, String studentID, int creditHours) {
        super(studentName, studentID);
        this.creditHours = creditHours;
        this.tuition = tuition;
    }

    @Override
    public void calcTuition() {
        tuition = 300 * creditHours;
    }

    public int getTuition () {
        return tuition;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("credit hours: " + creditHours);
        System.out.println("Tuition fee: $" + getTuition());
    }
}
