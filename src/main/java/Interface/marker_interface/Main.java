package Interface.marker_interface;

import java.io.*;

class Student implements Serializable {   // Marker interface
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.name = "Arvind";
        s.age = 22;

        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://javatrain//src//main//java//Interface//marker_interface/data.txt"));
        out.writeObject(s);   // works only because Student is Serializable
        out.close();
    }
}
