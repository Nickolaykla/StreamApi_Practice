import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStream {
    private static final List<Student> students = new ArrayList<>();
    static {
        students.add(new Student("Василий", "Петров", 17, 7.4, Faculty.ECONIMICS));
        students.add(new Student("Петр", "Кондратенко", 19, 9.2, Faculty.PHYSICS));
        students.add(new Student("Алексей", "Попов", 18, 8.4, Faculty.PHYSICS));
        students.add(new Student("Степан", "Шувалов", 20, 6.4, Faculty.ECONIMICS));
        students.add(new Student("Максим", "Иванов", 22, 7.7, Faculty.PHYSICS));
    }
    // sort
    public static List<Student> sortStudentsByName (List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentByGPA(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }
    // filter
    public static List<Student> filterByFaculty(List<Student> students, Faculty faculty) {
        return students.stream()
                .filter(student -> student.getFaculty().equals(faculty))
                .collect(Collectors.toList());
    }
    // find student with max GPA
    public static Student findStudentWithMaxGPA (List<Student> students) {
        return students.stream().max(Comparator.comparing(Student::getGpa)).orElse(null);
    }
    // find student with min GPA
    public static Student findStudentWithMinGPA (List<Student> students) {
        return students.stream().min(Comparator.comparing(Student::getGpa)).orElse(null);
    }
    // grouping students by faculty
    public static Map<Faculty, List<Student>> groupByFaculty (List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(Student::getFaculty));
    }
    public static void main(String[] args) {
        System.out.println(sortStudentsByName(students));
//        System.out.println(sortStudentByGPA(students));
//        System.out.println(filterByFaculty(students, Faculty.ECONIMICS));
//        System.out.println(findStudentWithMaxGPA(students));
//        System.out.println(findStudentWithMinGPA(students));
//        System.out.println(groupByFaculty(students));
    }
}

