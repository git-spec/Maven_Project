package org.example;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");
        String asciiArt = FigletFont.convertOneLine("hello");
        System.out.println(asciiArt);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}