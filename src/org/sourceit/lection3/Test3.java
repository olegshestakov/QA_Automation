package org.sourceit.lection3;

import static org.sourceit.lection3.Incapsulation.*;
import static org.sourceit.lection3.Incapsulation.main;

public class Test3 {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;

        System.out.println(season.ordinal());

        season.doMagic();

        season = Season.SPRING;

        season.doMagic();

        Human human = new Human();

        human.gender = Gender.F;

        Gender gender = Gender.F;
        Gender gender1 = Gender.M;

        gender.ordinal();


        System.out.println(Gender.valueOf("F").name());

        Incapsulation.main(new String[]{});

        try {
            divide(4, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("dfdf");
        }
    }

    public static int divide(int a, int b) throws RuntimeException {
        return a / b;
    }
}


class Human {
    Gender gender;
    String name;
}
