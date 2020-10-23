package pack1;

import java.lang.*;
public class TEST {
    public static void main(String[] args) {
        DOG d1 = new DOG("Bonya", 8);
        DOG d2 = new DOG("Stoya");
        DOG d3 = new DOG();
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        BALL q1 = new BALL("Blue", 20);
        BALL q2 = new BALL("Pink");
        BALL q3 = new BALL();
        System.out.println(q1.toString());
        System.out.println(q2.toString());
        System.out.println(q3.toString());
        BOOK b1 = new BOOK("Zamyatin", 1884);
        BOOK b2 = new BOOK("Lermontov");
        BOOK b3 = new BOOK();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }

}