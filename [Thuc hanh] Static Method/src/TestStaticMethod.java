public class TestStaticMethod {
    public static void main(String[] args) {
        Student.chance();

        Student s1 = new Student(111, "Q");
        Student s2 = new Student(222, "W");
        Student s3 = new Student(333, "E");

        s1.display();
        s2.display();
        s3.display();
    }
}
