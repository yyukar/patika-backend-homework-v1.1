package week5.records;

public class StudentTest {

    public static void main(String[] args) {

        // Create two identical student objects to test equals and hashCode
        Student student = new Student("yusuf","yukar",123);
        Student student1 = new Student("yusuf","yukar",123);

        System.out.println("student = " + student);
        System.out.println("student1 = " + student1);

        System.out.println("equals test: " + student.equals(student1));
        System.out.println("Hashcode test: " + (student.hashCode() == student1.hashCode()));

    }
}
