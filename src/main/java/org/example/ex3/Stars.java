package org.example.ex3;

import org.example.util.Check;

record Stars(int n) {
    Stars {
        Check.range(0 < n && n <= 10, n);
    }
}