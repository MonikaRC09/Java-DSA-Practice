import java.util.*;

class Student2 {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentComparatorExample {

    public static void main(String[] args) {

        List<Student2> list = new ArrayList<>();

        list.add(new Student2(1, "Akash"));
        list.add(new Student2(2, "ankit"));
        list.add(new Student2(3, "ajit"));

        Collections.sort(list, new Comparator<Student2>() {
            public int compare(Student2 s1, Student2 s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        for (Student2 s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
