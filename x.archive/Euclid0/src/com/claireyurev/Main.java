package com.claireyurev;

public class Main {

    public static void main(String[] args) {
	    int a = 2701;
        int b = 222;
        while ( b != 0 ) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Greatest Common Denominator is "+a);
    }
}
