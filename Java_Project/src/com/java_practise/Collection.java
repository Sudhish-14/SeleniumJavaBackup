package com.java_practise;

import java.util.ArrayList;
import java.util.Collections;
public class Collection {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(5);
    list.add(15);
    Collections.sort(list);
    System.out.println(list);
    }
}