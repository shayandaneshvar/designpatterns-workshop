package ir.ac.kntu.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Student implements Cloneable {
    private String name;
    private Course book;
    private List<Student> classmates;

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.setBook(book.clone());
        student.classmates = classmates.stream().map(classmate -> {
            try {
                return classmate.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }).filter(Objects::nonNull).collect(Collectors.toList());
        return student;
    }

    public Student(String name, Course book) {
        this.name = name;
        this.book = book;
        classmates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getBook() {
        return book;
    }

    public void setBook(Course book) {
        this.book = book;
    }

    public List<Student> getClassmates() {
        return classmates;
    }

}
