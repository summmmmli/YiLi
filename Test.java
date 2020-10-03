package assignment3;//Q1

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // create 11 students
        Student student1 = new Student("A", "a");
        Student student2 = new Student("B", "b");
        Student student3 = new Student("C", "c");
        Student student4 = new Student("D", "d");
        Student student5 = new Student("E", "e");
        Student student6 = new Student("F", "f");
        Student student7 = new Student("G", "g");
        Student student8 = new Student("H", "h");
        Student student9 = new Student("I", "i");
        Student student10 = new Student("J", "j");
        Student student11 = new Student("K", "k");

        // create course
        Course course = new Course("Java");

        // test
        System.out.println("Current number of the registered student: " + course.getNumberOfStudent());
        System.out.println("Is course full? " + course.isFull());

        course.registerStudent(student1);
        course.registerStudent(student2);
        course.registerStudent(student3);
        course.registerStudent(student4);
        course.registerStudent(student5);

        System.out.println("Current number of the registered student: " + course.getNumberOfStudent());
        System.out.println("Is course full? " + course.isFull());
        System.out.println("Current registered students: " + Arrays.toString(course.getStudents()));

        course.registerStudent(student6);
        course.registerStudent(student7);
        course.registerStudent(student8);
        course.registerStudent(student9);
        course.registerStudent(student10);

        System.out.println("Current number of the registered student: " + course.getNumberOfStudent());
        System.out.println("Is course full? " + course.isFull());
        System.out.println("Current registered students: " + Arrays.toString(course.getStudents()));

        System.out.println("Register the 11st student... " + course.registerStudent(student11));
    }
}