package org.example.watchout;

import static org.example.util.Show.show;

record Stars(int n) {
    Stars{
        show("In compact constructor");
        show("n: " + n + ", n(): " + n());
        x();
    }

    void x() {
        show("n: " + n + ", n(): " + n());
        show("this.n: " + this.n);
    }
}
