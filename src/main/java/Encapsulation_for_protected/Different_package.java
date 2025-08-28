package Encapsulation_for_protected;

import Encapsulation.Person;

public class Different_package extends Person{
    public Different_package(String name) {
        super(name);
    }

    public static void main(String[] args) {
        //subclass like this only work and calling this ->Person p=new Person("Arvi"); won't work
        Different_package obj=new Different_package("arvi");
//        System.out.println(x);
    }

}
