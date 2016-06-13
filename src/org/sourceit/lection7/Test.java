package org.sourceit.lection7;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test {

    public static void main(String[] args) {


        try (PrintStream stream = new PrintStream(new FileOutputStream(new File("test.log")))) {
            System.setOut(stream);

            System.out.println("hello, Oleg");
            System.out.println("i'm printstream");

            System.err.println("hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        stream

    }

}
