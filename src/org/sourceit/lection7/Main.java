package org.sourceit.lection7;

import java.io.*;
import java.util.Arrays;

// write sample file
public class Main {

    public static void main(String[] args) {

        File file = new File("test.txt");

        writeToFile(file);
        System.out.println("1. " + readFromFile(file));
        bufferedWrite(file);
        System.out.println("2. " + bufferedReadFromFile(file));
        bufferedWriter(file);
        System.out.println("3. " + bufferedReaderFromFile(file));

//        Arrays.sort
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(10);
            for (char c = 'a'; c <= 'z'; c++) {
                randomAccessFile.write(c);
            }
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void writeToFile(File file) {
        // try with resource
        try (FileOutputStream stream = new FileOutputStream(file)) {
            for (char c = '0'; c <= '9'; c++) {
                stream.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String readFromFile(File file) {
        String s = "";
        // try with resource
        try (FileInputStream stream = new FileInputStream(file)) {
            int part = 0;

            while ((part = stream.read()) != -1) {
                s += (char) part;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public static void bufferedWrite(File file) {
        // try with resource
        try (BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file))) {
            for (char c = '0'; c <= '9'; c++) {
                stream.write(c);
            }
            stream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String bufferedReadFromFile(File file) {
        String s = "";
        // try with resource
        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream(file))) {
            int part = 0;
            while ((part = stream.read()) != -1) {
                s += (char) part;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public static void bufferedWriter(File file) {
        // try with resource
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (char c = '0'; c <= '9'; c++) {
                writer.append(c);
            }
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String bufferedReaderFromFile(File file) {
        String s = "";
        // try with resource
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int part = 0;

            while ((part = reader.read()) != -1) {
                s += (char) part;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
}
