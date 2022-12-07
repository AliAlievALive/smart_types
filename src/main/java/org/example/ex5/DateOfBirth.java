package org.example.ex5;

import org.example.util.Check;

import static org.example.util.Show.show;

record Day(int n) {
    Day {
        Check.range(0 < n && n <= 31, this);
    }
}

enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31),
    // Only needed for this example:
    NONE(0);
    final int maxDays;
    Month(int maxDays) {
        this.maxDays = maxDays;
    }
    public static Month number(int n) {
        if (Check.range(1 <= n && n <= 12, "Month.number(" + n + ")"))
            return values()[n - 1];
        return NONE;
    }
    void checkDay(Day day) {
        Check.range(day.n() <= maxDays, this + ": " + day);
    }
}

record Year(int n) {
    Year {
        Check.range(1900 < n && n <= 2022, this);
    }
}

record BirthDate(Month m, Day d, Year y) {
    BirthDate {
        m.checkDay(d);
    }
}

public class DateOfBirth {
    static void test(int m, int d, int y) {
        show(m + "/" + d + "/" + y);
        show(new BirthDate(
                Month.number(m), new Day(d), new Year(y)
        ));
    }
    public static void main(String[] args) {
        test(7, 8, 1957);
        test(0, 32, 1857);
        test(2, 31, 2022);
        test(9, 31, 2022);
        test(4, 31, 2022);
        test(6, 31, 2022);
        test(11, 31, 2022);
        test(12, 31, 2022);
        test(13, 31, 2022);
    }
}
