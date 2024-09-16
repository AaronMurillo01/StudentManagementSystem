// src/StudentManagementSystem.java
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    // List to store students
    private static ArrayList<Student> students = new ArrayList<>();
    
    // Scanner object for input
    private static Scanner scanner = new Scanner(System.in);

    // Main method
    public static void main(String[] args) {
        boolean running = true;
        
        // Main menu loop
        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to add a new student
    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Student Course: ");
        String course = scanner.nextLine();
        
        System.out.print("Enter Student Grade: ");
        double grade = scanner.nextDouble();
        
        students.add(new Student(id, name, course, grade));
        System.out.println("Student added successfully.");
    }

    // Method to view all students
    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\n--- List of Students ---");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Method to update a student's details
    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        String id = scanner.nextLine();
        
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                System.out.print("Enter new name (or press Enter to keep current): ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) {
                    student.setName(name);
                }
                
                System.out.print("Enter new course (or press Enter to keep current): ");
                String course = scanner.nextLine();
                if (!course.isEmpty()) {
                    student.setCourse(course);
                }
                
                System.out.print("Enter new grade (or -1 to keep current): ");
                double grade = scanner.nextDouble();
                if (grade != -1) {
                    student.setGrade(grade);
                }
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to delete a student
    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();
        
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
