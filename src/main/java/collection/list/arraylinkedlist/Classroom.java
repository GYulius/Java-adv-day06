package collection.list.arraylinkedlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Classroom {
    private List<Student> studentList; // List to store students
    private List<Course> courseList; // List to store courses

    public Classroom() {
        studentList = new ArrayList<>(); // Initialize student list with ArrayList
        courseList = new LinkedList<>(); // Initialize course list with LinkedList
    }

    // Method to add a student to the student list
    public void addStudent(Student student) {
        studentList.add(student); // Add student to the list
        System.out.println(student.getName() + " has been added to the class"); // Print confirmation message
    }

    // Method to remove a student from the student list by name
    public void removeStudent(String name) {
        studentList.removeIf(student -> student.getName().equals(name)); // Remove student if name matches
    }

    // Method to display all students in the student list
    public void displayStudents() {
        System.out.println("Students in the class:"); // Print header
        studentList.forEach(student -> System.out.println(student)); // Print each student's details
    }

    // Method to sort students by their names
    public void sortStudentsByName() {
        studentList.sort(Comparator.comparing(Student::getName)); // Sort students by name
        System.out.println("Students sorted by name"); // Print confirmation message
    }

    // Method to add a course to the course list
    public void addCourse(Course course) {
        courseList.add(course); // Add course to the list
        System.out.println(course.getCourseName() + " has been added to the class"); // Print confirmation message
    }

    // Method to remove a course from the course list by name
    public void removeCourse(String name) {
        courseList.removeIf(course -> course.getCourseName().equals(name)); // Remove course if name matches
    }

    // Method to display all courses in the course list
    public void displayCourses() {
        System.out.println("Courses in the class:"); // Print header
        courseList.forEach(course -> System.out.println(course)); // Print each course's details
    }

    // Method to sort courses by their names
    public void sortCourseByName() {
        courseList.sort(Comparator.comparing(Course::getCourseName)); // Sort courses by name
        System.out.println("Courses have been sorted by name"); // Print confirmation message
    }
}
