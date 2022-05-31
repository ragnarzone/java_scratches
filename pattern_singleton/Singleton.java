// This java app allows to test Singleton programming pattern

class Singleton {
    // Here we'll store our instance of class
    private static Singleton instance;

    // We have one field
    private String value;

    // Getter for value
    public String getValue() {
        return value;
    }

    // private constructor to protect creation of instances from outside
    private Singleton(String value) {
        this.value = value;
    }

    // this static method used to create instance of our class and check if it is already exist
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}

// Testing
class SingletonTest {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance("Hello!");
        Singleton second = Singleton.getInstance("Goodbye!");

        // true
        System.out.println(first == second);

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());
    }
}
