package Encapsulation;

public class Person {
    protected String name;
    private int age;
    protected int roll_no=10;
    protected String nick_name;

    public Person(String nick_name) {
        this.nick_name=nick_name;
        System.out.println(this.nick_name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
    
}
