public class Main {
    public static void main(String[] args) {
        // Instances of the class

        Library magazine = new Magazine("Magazines", "Analog", 20, 
        "Glade Garnet");
        Library flashDrive = new FlashDrive("Flash drives", "Digital", 137, "SanDisk");
        Library vhs = new Vhs("VHS records", "Digital", 48, "Philips");

        // Implementations of the class instances
        magazine.display();
        magazine.userPreference();
        System.out.println();

        flashDrive.display();
        flashDrive.userPreference();
        System.out.println();

        vhs.display();
        vhs.userPreference();
        System.out.println();
    }
}