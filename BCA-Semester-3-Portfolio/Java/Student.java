// Demonstrates a class, object, constructor and methods.
public class Student {
    String name;
    int semester;

    Student(String name, int semester) {
        this.name = name;
        this.semester = semester;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
    }

    public static void main(String[] args) {
        Student student = new Student("Aman Kumar", 3);
        student.displayDetails();
    }
}
