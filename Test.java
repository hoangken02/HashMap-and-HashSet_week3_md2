import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("no1", 1, "VN");
        Student student2 = new Student("no2", 2, "VN");
        Student student3 = new Student("no3", 3, "VN");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println();
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students
        ) {
            System.out.println(student.toString());
        }
    }
}
