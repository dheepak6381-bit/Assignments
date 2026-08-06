import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.rollNo, s.rollNo);
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class sortArrayListComparable {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(5, "Aman"));
        list.add(new Student(2, "Karan"));
        list.add(new Student(9, "Ravi"));
        list.add(new Student(1, "Nisha"));

        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }
}
