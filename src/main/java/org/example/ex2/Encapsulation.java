package org.example.ex2;

import static org.example.util.Show.show;

public class Encapsulation {
    public static void main(String[] args) {
        Stars[] s = {
                new Stars(1), new Stars(3),
                new Stars(2), new Stars(6),
                new Stars(11),
        };
        show(Stars.f3(s[1], s[3]));
        var s1 = s[1];
        show(s1);
        show(s1.f1(s[2]));
        show(s1.f2(s[3]));
        show(s1.f2(s1));
        show(s1.f2(s1));
    }
}
