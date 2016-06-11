package org.sourceit.lection3;

//import static org.sourceit.lection2.lection3.addiotion.Test.*;

public /*final*/ class Incapsulation {

    protected InnerInFile innerInFile;
    String defaultStr;

    // compilation constant
    final String HELLO = "FERt";

    // runtime constant
    final String Hello;

    public Incapsulation() {
        this.Hello = "default";
    }

    public Incapsulation(String hello) {
        Hello = hello;
    }

    public final void method() {
        System.out.println("fgghh");
    }

    public static void doMagic() {
        System.out.println("Incapsulation");
    }

    public void method1(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }

    public String toString() {
        return "Incapsulation[" + Hello + "]";
    }

    public static void main(String[] args) {
        Incapsulation incapsulation = new Incapsulation("hello1");
        Incapsulation incapsulation1 = new Incapsulation("hello2");
        Incapsulation incapsulation2 = new Incapsulation("hello3");

        incapsulation.method1("Hello, ", "World");

//        System.out.println(incapsulation);
//        System.out.println(incapsulation1);
//        System.out.println(incapsulation2);

        InnerInc inc1 = new InnerInc();
        InnerInc inc2 = new InnerInc();

        inc1.method1("Hello, ", "World");


        Incapsulation incapsulation3 = new InnerInc();

//        incapsulation3.doMagic();

        incapsulation3.method();
        incapsulation3.method1("Hello, ", "World");

        InnerInc inc = (InnerInc) incapsulation3;

//        inc.doMagic();

        inc.doMagic();

//        InnerInc.toString();
//        domagic();

//        String s = (String) incapsulation3;

//        System.out.println(inc1);
//        System.out.println(inc2);


        // wrong
//        incapsulation.HELLO = "dfdgfe";
//        incapsulation.Hello = "sdfdf";
    }
}

class InnerInc extends Incapsulation {

    @Override
    public String toString() {
        return super.toString() + " InnerInc{}";
    }

    public static void doMagic() {
        System.out.println("InnerInc");
    }

    @Override
    public void method1(String s1, String s2) {
        System.out.println(s2);
    }
}


class InnerInFile {

}
