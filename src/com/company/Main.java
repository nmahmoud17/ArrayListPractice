package com.company;

import java.lang.reflect.Array;
import java.security.AlgorithmConstraints;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList someApprentices = new ArrayList();
        someApprentices.add("Nada");
        someApprentices.add("Omar");
        someApprentices.add("Christie");
        someApprentices.add("Jamie");
        ArrayList moreApprentices = new ArrayList(someApprentices);
        moreApprentices.add("Brian");
        moreApprentices.add("Kareem");
        moreApprentices.add(true);

        System.out.println(moreApprentices);

        ArrayList<String> stringsOnly = new ArrayList<String>();
        stringsOnly.add("hello");
        stringsOnly.add("hi");
        //doesn't work
        //

        ArrayList<String> allStrings = new ArrayList<String>();
        allStrings.addAll(stringsOnly);
        allStrings.add(1,"wassup");

        System.out.println(allStrings);

    }
}
