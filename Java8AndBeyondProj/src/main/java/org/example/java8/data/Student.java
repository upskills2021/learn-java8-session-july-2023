package org.example.java8.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private int noteBooks;
    List<String> activities = new ArrayList<>();

    public Student(Integer id, String name, int gradeLevel, double gpa, String gender, int noteBooks, List<String> activities) {
        this.id = id;
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.noteBooks = noteBooks;
        this.activities = activities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getGradeLevel() == student.getGradeLevel() && Double.compare(student.getGpa(), getGpa()) == 0 && getNoteBooks() == student.getNoteBooks() && Objects.equals(getId(), student.getId()) && Objects.equals(getName(), student.getName()) && Objects.equals(getGender(), student.getGender()) && Objects.equals(getActivities(), student.getActivities());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getGradeLevel(), getGpa(), getGender(), getNoteBooks(), getActivities());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                '}';
    }
}
