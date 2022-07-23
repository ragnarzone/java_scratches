package access;

class Soup1 {
    private Soup1() {}

    // Allow creation via static method
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}

    // Create a static object and return a reference
    // upon request. The "singleton" pattern.
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }
    public void f() {}
}

// One public class allowed per file:
public class Lunch {
    void testPrivate() {
        // Can't do this because of private constructor
        // Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
