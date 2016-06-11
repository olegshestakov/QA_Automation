package org.sourceit.lection2;

import java.util.Random;

//import org.sourceit.lection3.

public class Main {

    public static void main(String[] args) {
        int a = new Random(3).nextInt();
        int b = new Random(56).nextInt();

        if (a < b) {
            System.out.println("a < b" + a + " " + b);
        } else {
            System.out.println("a > b == " + a + " " + b);
        }

        System.out.println(isEven(5));

        int c[] = new int[100];

        for (int i = 0; i < c.length; i++) {
            c[i] = new Random(i).nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            if (isEven(c[i])) {
                c[i] += 1;
            }
        }

        for (int i = 0; i < c.length; i++) {
            if (i != c.length - 1) {
                System.out.print("" + c[i] + ", ");
            } else {
                System.out.print("" + c[i]);
            }
        }

        play(false);

        int[][] bs = new int[10][10];

//        for (int i = 0; i < bs.length; i++) {
//            for (int j = 0; j < bs[i].length; j++) {
//                bs[i][j] = i;
//                System.out.println("bs[" + i + ", " + j + "] = " + bs[i][j]);
//            }
//        }

        int nb = 45;

        switch (nb) {
            case 45:
                System.out.println("dfgf");
            case 900:
                System.out.println("45");
                System.out.println("900");
                break;
            default:
                System.out.println("default " + nb);
                break;
        }

    }

    public static boolean isEven(int a) {
        boolean even;
        if (a % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
        return even;
    }

    //
    /*
    dsfg
    sdff
    sff
     */
    public static void play(boolean logic/*0*//*0*//*false*/) {
        while (logic) {
            System.out.println("hello");
        }
        do {
            System.out.println("hello");
//            from++;
        } while (logic);
    }

    public static void doMagic() {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                return;
            }
        }
    }

    public static long fact(long num) {
        return num != 1 ? num * fact(--num) : 1;
    }

    public static long product(long one, long two) {
        if (one != 0) {
            return two + product(--one, two);
        }
        return 0;
    }

}
