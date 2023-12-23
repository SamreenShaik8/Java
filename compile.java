class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
    }

    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo(int age) {
        System.out.println(age);
    }

    public void displayInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class compile {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "samreen";
        s1.age = 21;
        s1.displayInfo(s1.name);
    }
}
