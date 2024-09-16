// src/Student.java
public class Student {
    private String studentId;
    private String name;
    private String course;
    private double grade;

    // Constructor
    public Student(String studentId, String name, String course, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Override toString method to print student details
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Course: " + course + ", Grade: " + grade;
    }
}
