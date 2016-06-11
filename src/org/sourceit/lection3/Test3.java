package org.sourceit.lection3;

public class Test3 {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;

        System.out.println(season.ordinal());

        season.doMagic();

        season = Season.SPRING;

        season.doMagic();

        Human human = new Human();

        human.gender = Gender.F;

    }
}


class Human {
    Gender gender;
    String name;

}
