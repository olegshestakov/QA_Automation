package org.sourceit.lection3;

public abstract class AbstractClass {


//    public abstract static void doM();

    int pointA;
    int pointB;

    static int y;

    public AbstractClass() {
        pointA = 0;
        pointB = 0;
    }

    public abstract void doMagic();

    public void fert(String t) {

    }

}

class Circle1 extends AbstractClass {

    @Override
    public void doMagic() {
        System.out.println("circle1 do magic");
    }
}
