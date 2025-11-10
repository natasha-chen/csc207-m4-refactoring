package theater;

/**
 * Class representing an invoice for a customer.
 */
public class Play {

    private final String name;
    private final String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public final String getName() {
        return name;
    }

    public final String getType() {
        return type;
    }
}
