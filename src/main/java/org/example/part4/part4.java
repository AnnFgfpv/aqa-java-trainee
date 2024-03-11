package org.example.part4;
import java.util.Arrays;
import java.util.Collection;

public class part4 {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        double averageAgeOfMen = calculateAverageAgeOfMen(students);
        System.out.println("Средний возраст студентов мужского пола: " + averageAgeOfMen);

        printDraftCandidates(students);
    }
    private static void printDraftCandidates(Collection<Student> students) {
        System.out.println("Студенты, которым грозит получение повестки в этом году:");
        for (Student student : students) {
            if (student.getGender() == Gender.MAN && isDraftAge(student.getAge())) {
                System.out.println(student.getName());
            }
        }
    }
    private static double calculateAverageAgeOfMen(Collection<Student> students) {
        int sum = 0;
        int count = 0;
        for (Student student : students) {
            if (student.getGender() == Gender.MAN) {
                sum += student.getAge();
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }
    private static boolean isDraftAge(int age) {
        return age >= 18 && age <= 27;
    }

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }
}

