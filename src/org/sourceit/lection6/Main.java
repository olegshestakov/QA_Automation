package org.sourceit.lection6;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws Exception {

        try {
            int i = 0;
            int y = 80;
            throwException(0);
            throwException(101);

        } catch (BiggerThan100Exception bg) {
            int i = 90;
            throwException(i);
//            bg.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int i = 90;
        int y = 70;

        System.out.println(i + y);

    }

    public static int throwException(int i) throws Exception, IllegalArgumentException {
        try {
            if (i == 0) {
                throw new IllegalArgumentException("Please specify not 0");
            } else if (i > 100) {
                throw new Exception("Please specify less then 100");
            }

            return i / 30;
//            throw new Exception("Test");
        } catch (IllegalArgumentException |
                OutOfMemoryError |
                SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(" == 0");
            return 0;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("> 100");
            throw new BiggerThan100Exception("> 100", e);
        } finally {
            System.out.println("ended!!!");
            return 60;
        }
//        return 0;
    }

}

class BiggerThan100Exception extends Exception {

    public BiggerThan100Exception() {
    }

    public BiggerThan100Exception(String message, Throwable cause) {
        super(message, cause);
    }
}
