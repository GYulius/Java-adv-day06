package collection.list.arraylinkedlist;

public class Course {

    private String courseName; // Course name

    public Course(String courseName) {
        this.courseName = courseName; // Initialize course name
    }

    public String getCourseName() {
        return courseName; // Get course name
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName; // Set course name
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}'; // Override toString method to display course details
    }
}