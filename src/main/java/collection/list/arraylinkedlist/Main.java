package collection.list.arraylinkedlist;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom(); // Create a Classroom object

        classroom.addStudent(new Student("Mihai")); // Add student Mihai
        classroom.addStudent(new Student("George")); // Add student George
        classroom.addStudent(new Student("Daniel")); // Add student Daniel

        classroom.displayStudents(); // Display all students

        classroom.sortStudentsByName(); // Sort students by name
        classroom.displayStudents(); // Display all students after sorting

        classroom.removeStudent("Daniel"); // Remove student Daniel
        classroom.displayStudents(); // Display all students after removal

        classroom.addCourse(new Course("Biology")); // Add course Biology
        classroom.displayCourses(); // Display all courses
    }
}