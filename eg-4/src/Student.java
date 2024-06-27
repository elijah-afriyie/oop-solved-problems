public abstract class Student {
    // Private fields
    private String studentName;
    private String studentID;

    // Constructor
    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public abstract void calcTuition();

    public void displayDetails() {
        System.out.println("Student name: " + getStudentName());
        System.out.println("Student ID: " + getStudentID());
    }

    // Get student information
    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

}
