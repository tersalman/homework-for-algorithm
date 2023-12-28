package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringList b = new StringListIm(7);
        b.add("hi");
        b.add("hi again");
        b.add(1,"salm");
        b.add("bye");
        b.add("hi");

//

        System.out.println(Arrays.toString(b.toArray()));
    }
}