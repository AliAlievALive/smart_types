package org.example.ex1;

import org.example.util.Check;

import static org.example.util.Show.show;

public class Starred {
    static int f1(int stars) {
        Check.range(0 < stars && stars <= 10, stars);
        return stars * 2;
    }

    static int f2(int stars) {
        Check.range(0 < stars && stars <= 10, stars);
        return stars + 4;
    }

    public static void main(String[] args) {
        int stars1 = 6;
        show(stars1);
        show(f1(stars1));
        show(f2(stars1));
        int stars2 = 11;
        show(f1(stars2));
        stars1 = 99;
        show(f2(stars1));
    }
}
