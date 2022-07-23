package enumerated_types;

// shows two methods of enum
// values() and ordinal()
public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
}
