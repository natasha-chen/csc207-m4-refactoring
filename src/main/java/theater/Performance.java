package theater;

/**
 * Class representing a performance of a play..
 */
public class Performance {

    private final String playID;
    private final int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    public final String getPlayID() {
        return playID;
    }

    public final int getAudience() {
        return audience;
    }
}
