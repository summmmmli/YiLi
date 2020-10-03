package assignment3;//Q1

public class Course {
	private static final int CAPACITY = 10;

    private String name;

    private int numberOfStudent;

    private Student[] registeredStudents;

    public Course(String name) {
        this.name = name;
        this.numberOfStudent = 0;
        this.registeredStudents = new Student[CAPACITY];
    }

    public Student[] getStudents() {
        return registeredStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public boolean isFull() {
        return numberOfStudent >= CAPACITY;
    }

    public boolean registerStudent(Student student) {
        if (numberOfStudent < CAPACITY) {
            registeredStudents[numberOfStudent++] = student;
            return true;
        }

        return false;
    }

}
