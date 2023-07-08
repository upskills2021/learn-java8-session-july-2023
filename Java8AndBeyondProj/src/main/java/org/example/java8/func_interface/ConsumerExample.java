package org.example.java8.func_interface;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c1 = (s) -> System.out.printf("Student Info :: [{%s}]%n", s);
    static Consumer<Student> c2 = (s) ->  System.out.printf("Student Id:: [{%s}] and Activities :: [{%s}]%n",s.getId(), s.getActivities());
    static Consumer<Student> c3 = (s) -> System.out.printf("Student Name :: [{%s}] :: ", s.getName().toUpperCase());
    static Consumer<Student> c4 = (s) -> System.out.printf("Student Activities :: [{%s}] :: ", s.getActivities());

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        //studentList.forEach(c1);
        //studentList.forEach(c2);
        printStudentsNameAndActivitiesUsingGradeAndGpaLimits(studentList);
    }

    //print students having grade above 3 and gpa above 3.9
    public static void printStudentsNameAndActivitiesUsingGradeAndGpaLimits(List<Student> students) {
        students.forEach(s -> {
            if(s.getGradeLevel() > 3 && s.getGpa() >= 3.9) {
                c3.andThen(c4).accept(s);
            }
        });

    }
}
