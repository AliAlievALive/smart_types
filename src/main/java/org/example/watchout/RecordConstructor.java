package org.example.watchout;

import static org.example.util.Show.show;

public class RecordConstructor {
    public static void main(String[] args) {
        var s = new Stars(10);
        show("After constructor");
        s.x();
    }
}
