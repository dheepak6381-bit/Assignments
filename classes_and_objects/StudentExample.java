class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 101);
        Student s2 = new Student("Priya", 102);
        s1.display();
        s2.display();
    }
}
