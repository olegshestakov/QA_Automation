package org.sourceit.lection3;

import org.sourceit.lection3.Incapsulation;
import org.sourceit.lection3.InnerInFile;

public class Test {

    public static void main(String[] args) {

        // creation of object
        A a = new A();

        // call for property
        a.t = 2;
        // call for method
        a.meth();

        a.methK(6);


        // exect entity
        Point p = new Point();
        p.x = 2;
        p.y = 3;

        System.out.println(p.x * p.y);

        // default
        Point p1 = new Point();

        System.out.println("default -- " + p1.x + " " + p1.y);

        // with 2 parameters
        Point p2 = new Point(45, 56);

        System.out.println("p2 --" + p2.x + " " + p2.y);

        Point p3 = new Point(89);

        System.out.println("p3 -- " + p3.x + " " + p3.y);


        // statics
        System.out.println("PI in my world -- " + Circle.PI);
        Circle.y = 78;
        Circle.meth();

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();

        c3.y = 56;

        Circle.meth();

        p3.doMagic();
        p3.doMagic(56);
        p3.doMagic(456, 67);
        p3.doMagic(45, 56, 78);

        Square square = new Square();
        square.length = 45;

        square.draw();
        square.common = 70;

        Square square1 = new Square(1);

        Square square2 = new Square(2);

        Square square3 = new Square(1.5);
    }

}

class A extends Object {
    int t;

    String y;

    void meth() {

    }

    int methK(int y) {
        System.out.println(y);
        return 0;
    }

}

// declaration - chertezh
class Point {
    public double x;
    public double y;


    Point() {
        this.x = 0;
        this.y = 6;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(double xy) {
//        this.x = this.y = xy;
        this(xy, xy);
        this.doMagic();
    }

    Point(int t) {
        this(t, t);
    }

    // ----- overloading
    void doMagic() {
        System.out.println("do magic");
    }

    void doMagic(int t) {
        System.out.println("do magic " + t);
    }

    void doMagic(int t, int h) {
        System.out.println("do magic " + (t + h));
    }

    int doMagic(int t, int h, int k) {
        System.out.println("do magic " + (t + h + k));
        return (t + h + k);
    }

    // ----- overloading

}

class Circle {
    final static double PI = 4;

    static int y = 0;

    int t;

    static void meth() {
        System.out.println("meth " + y);

        // wrong
//        this.t = 89;
    }

}

// extending

class Shape {

    int common = 90;

    Shape() {
        System.out.println("shape");
    }

    Shape(int color) {
        System.out.println("shape param " + color);
    }

    void draw() {
        System.out.println("shape method draw");
    }
}

class ShapeCircle extends Shape {

}

class Square extends Shape {

    double length;

    Square() {
        super(4);
        System.out.println("square");
    }

    Square(double length) {
        this.length = length;
    }

//    Square(int length) {
//
//    }

}

class Triangle extends Shape {

}
