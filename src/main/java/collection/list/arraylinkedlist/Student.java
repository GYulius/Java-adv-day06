package collection.list.arraylinkedlist;


public class Student {
    private String name; // Student name

    public Student(String name) {
        this.name = name; // Initialize student name
    }

    public String getName() {
        return name; // Get student name
    }

    public void setName(String name) {
        this.name = name; // Set student name
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}'; // Override toString method to display student details
    }
}