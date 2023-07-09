package org.example.java8.streams;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        System.out.println(":: Students with highest grade :: \n\t\t[ID] [NAME] [GRADE]" + combineHighestGradeStudentsNames());
    }

    private static String combineHighestGradeStudentsNames() {
        List<Student> students = StudentDatabase.getAllStudents();
        Optional<Integer> optionalGrade = findHighestGrade(students);
        if(optionalGrade.isPresent()) {
            int highestGrade = optionalGrade.get();
           return students.stream()
                    .filter(s -> s.getGradeLevel() == highestGrade)
                    .map(s -> String.format("\t\t[%s] [%s] [%s]",s.getId(), s.getName(), s.getGradeLevel()))
                    .reduce("", (s1,s2) -> String.join("\n", s1, s2));
        }
        return null;
    }

    private static Optional<Integer> findHighestGrade(List<Student> students) {
        return students.stream()
                .map(Student::getGradeLevel)
                .distinct()
                .reduce((g1,g2) -> (g1 > g2) ? g1 : g2);
    }
}
