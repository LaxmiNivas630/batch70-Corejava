package com.javafundamental;

import java.math.BigInteger;
import java.math.BigDecimal;

public class TestDemo1datyatypes {

    // Type mismatch example (Cannot assign int directly)
    // BigInteger bi = 100;   // ❌ Error
    // BigDecimal bd = 200;   // ❌ Error

    // String Literal (stored in String Constant Pool)
    String s1 = "SrikanthJava";

    // Only declaration (default values will print)
    String s3;
    Integer i3;
    BigInteger bi3;
    BigDecimal bd3;
    Character c3;
    Float f3;
    Double d3;
    Boolean b3;

    // User defined reference variables
    Car car;
    Dog dog;

    // BigInteger objects
    BigInteger bi1 = new BigInteger("656754638387563475345634875643875674365");
    BigInteger bi2 = new BigInteger("656754638387563475345634875643875674365");

    // BigDecimal objects
    BigDecimal bd1 = new BigDecimal(
            "98765423578908765434567890765435678909765489096545678997654356786578907654");
    BigDecimal bd2 = new BigDecimal(
            "98765423578908765434567890765435678909765489096545678997654356786578907654");

    public static void main(String[] args) {

        System.out.println("main method started !");

        TestDemo1datyatypes t3 = new TestDemo1datyatypes();

        // Printing default values (Wrapper & Reference types = null)
        System.out.println(t3.s3);
        System.out.println(t3.i3);
        System.out.println(t3.bi3);
        System.out.println(t3.bd3);
        System.out.println(t3.c3);
        System.out.println(t3.f3);
        System.out.println(t3.d3);
        System.out.println(t3.b3);
        System.out.println(t3.car);
        System.out.println(t3.dog);

        System.out.println("-----------------------------");

        // Printing BigInteger values
        System.out.println(t3.bi1);
        System.out.println(t3.bi2);

        // ❌ Operator + not allowed for BigInteger
        // System.out.println(t3.bi1 + t3.bi2);

        // ✅ Correct way
        System.out.println(t3.bi1.add(t3.bi2));
        System.out.println(t3.bi1.multiply(t3.bi2));

        System.out.println("*****************************");

        // BigDecimal operations
        System.out.println(t3.bd1.add(t3.bd2));
        System.out.println(t3.bd1.multiply(t3.bd2));

        System.out.println("*****************************");

        // Printing String literal
        System.out.println(t3.s1);
    }
}

// Dummy classes (so no compilation error)
class Car {
}

class Dog {
}