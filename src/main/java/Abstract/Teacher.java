package Abstract;

abstract public class Teacher {
    static int age;
    public Teacher(int age) {
        this.age=age;

    }
    static void getage(){
        System.out.println(age);
    }

    abstract void name();
}
