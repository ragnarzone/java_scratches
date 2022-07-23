package access;

class Sundae {
    private Sundae() {
        System.out.println("I am here!");
    }
    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        // Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}
