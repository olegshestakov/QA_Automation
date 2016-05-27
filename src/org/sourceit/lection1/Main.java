package org.sourceit.lection1;

public class Main {

    String t = new String("dff");

    public static void main(String[] args) {

        byte b = 1;
        short s = 4;
        int i = 0;
        long l = 70L;

        float f = 5.0F;
        double d = 5.0;

        // binary
        i = 0b10101;
        System.out.println(i);
        // octal
        i = 010101;
        System.out.println(i);
        // hex
        i = 0x10101;
        System.out.println(i);
        i = 0xffff;
        System.out.println(i);

//        System.out.println(getFar(25));
//        System.out.println(getFar(79));
//        System.out.println(getFar(67));

        b = (byte) s;

//        char c = 127;
//        System.out.println(c);
//        c = '\u5679';
//        System.out.println(c);
//        c = 'd';
//        System.out.println(c);

//        Integer integer = new Integer(i);
//        Integer integer1 = new Integer(56);
//        integer.equals(integer1);


        int uer = 0;
        uer = uer++;
        System.out.println(uer);

        uer = ++uer;
        System.out.println(uer);

        uer = 0;

        int h = 0;

        h = uer++;
        System.out.println(h);
        h = ++uer;
        System.out.println(h);

        int[] y = new int[34];

        int[] ty = new int[]{23};

        int[] inegerArr = new int[]{1, 4};

        i = inegerArr[0];

        int t = 5 < 6 ?
                (0 > -1 ? 70 : 67)
                : 7;

        System.out.println(t);

    }

    public static float getFar(int cels) {
        return ((float) 9 / 5) * cels + 32;
    }
}
