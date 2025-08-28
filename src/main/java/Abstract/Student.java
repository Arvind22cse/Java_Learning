package Abstract;

public class Student extends Teacher{
    @Override
    void name() {
        System.out.println("Hi I am Arvi");

    }

    public Student(int age) {
        super(age);
    }
}
