package org.sourceit.lection3;


interface Magicable {

    void doMagic();

}

interface Durable {

    void timeout(long time);

}

class MyJob implements Magicable, Durable {

    @Override
    public void doMagic() {
    }

    @Override
    public void timeout(long time) {
    }
}

enum Season {
    SUMMER("summer"),
    AUTUMN("autumn"),
    WINTER("winter"),
    SPRING("spring", 45);

    Season(String name) {
        this(name, 0);
    }

    Season(String name, int k) {
        this.name = name;
        this.k = k;
    }

    private int k;
    private String name;

    public void doMagic() {
        System.out.println("do magic " + this.k);
    }
}

enum Gender {
    M, F;
}
