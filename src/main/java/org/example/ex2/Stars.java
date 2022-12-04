package org.example.ex2;

import org.example.util.Check;

public class Stars {
    private int n;

    static void validate(int s) {
        Check.range(0 < s && s <= 10, s);
    }

    public Stars(int n) {
        validate(n);
        this.n = n;
    }

    Stars f1(Stars stars) {
        n = n % 5 + stars.n * 2;
        validate(n);
        return this;
    }

    Stars f2(Stars stars) {
        n = n % 5 + stars.n + 2;
        validate(n);
        return this;
    }

    static Stars f3(Stars s1, Stars s2) {
        return new Stars(s1.n + s2.n);
    }

    @Override
    public String toString() {
        return "Stars(" + n + ')';
    }
}


