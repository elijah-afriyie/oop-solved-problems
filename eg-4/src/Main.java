public class Main {
    public static void main(String[] args) {
        // Create an array of students
        Student[] students = new Student[4];
        students[0] = new Undergraduate("Byant", "BN20394B", 150);
        students[1] = new Undergraduate("Elsie", "EN30495C", 120);
        students[2] = new Graduate("Alex", "AX29873D", 40);
        students[3] = new Graduate("Sophia", "SP99723", 50);

       for (Student student : students) {
        student.calcTuition();
        student.displayDetails();
        System.out.println();
       }
    }
}
