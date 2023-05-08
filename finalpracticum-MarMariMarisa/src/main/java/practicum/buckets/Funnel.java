package practicum.buckets;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a funnel into which balls may be poured. Balls drop one at a time
 * out of the bottom of the funnel.
 */
public class Funnel {
    /**
     * An ordered list of balls.
     */
    private final ArrayList<Ball> balls;

    /**
     * Creates a new, empty funnel.
     */
    public Funnel() {
        this.balls = new ArrayList<Ball>();
    }

    /**
     * Creates a new funnel with an initial collection of balls.
     * 
     * @param balls The collection of balls poured into the funnel.
     */
    public Funnel(Collection<Ball> balls) {
        this();
        pourIntoTop(balls);
    }

    /**
     * Pours the given balls into the funnel.
     * 
     * @param balls The balls to pour into the funnel.
     */
    public void pourIntoTop(Collection<Ball> balls) {
        this.balls.addAll(balls);
    }

    /**
     * Returns a boolean indicating whether or not the funnel is empty.
     * 
     * @return True if the funnel is empty, false otherwise.
     */
    public boolean isEmpty() {
        return this.balls.size() == 0;
    }

    /**
     * Returns but does not remove the ball at the bottom of the funnel.
     * 
     * @return The ball at the bottom of the funnel. The ball is not removed.
     */
    public Ball peekAtBottom() {
        return this.balls.get(this.balls.size() - 1);
    }

    /**
     * Drops a ball from the bottom of the funnel. This method will throw an 
     * exception if the funnel is empty.
     * 
     * @return The ball dropped from the bottom funnel.
     */
    public Ball dropFromBottom() {
        return this.balls.remove(this.balls.size() - 1);
    }

    @Override
    public String toString() {
        return this.balls.toString();
    }
}
