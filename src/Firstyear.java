// This is very big program dont worry about this 

class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

class CollegeClass {
    String className;
    String staffName;
    int numberOfStudents;
    Student[] students;

    CollegeClass(String className, String staffName, int numberOfStudents) {
        this.className = className;
        this.staffName = staffName;
        this.numberOfStudents = numberOfStudents;
        this.students = new Student[numberOfStudents];
    }

    void addStudent(Student student, int index) {
        if (index >= 0 && index < numberOfStudents) {
            students[index] = student;
        } else {
            System.out.println("Invalid index for adding a student.");
        }
    }

    void displayClassInfo() {
        System.out.println("Class: " + className);
        System.out.println("Staff: " + staffName);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Students:");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Roll Number: " + students[i].rollNumber + "\tName: " + students[i].name);
        }
    }
}

public class Firstyear{
    public static void main(String[] args) {
        // Creating a first-year class
        CollegeClass firstYearClass = new CollegeClass("BCA", "John Doe", 3);

        // Adding students to the class
        firstYearClass.addStudent(new Student("Alice", 101), 0);
        firstYearClass.addStudent(new Student("Bob", 102), 1);
        firstYearClass.addStudent(new Student("Charlie", 103), 2);

        // Displaying class information
        firstYearClass.displayClassInfo();
    }
}
