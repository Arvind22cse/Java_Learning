package com.example.javatrain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        //ll.add(10);
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<10;i++) {
            al.add(i*2);
        }
        int[] a={1,2,3,4};
        Arrays.sort(a);
        ll.addAll(10,al);
        for(int i=0;i<ll.size();i++) {
            System.out.println(ll.get(i));
        }
    }
}