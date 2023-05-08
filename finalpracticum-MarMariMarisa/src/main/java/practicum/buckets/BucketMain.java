package practicum.buckets;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BucketMain {
    public static void main(String[] args) {
        /*
         * Create and fill the funnel
         */
        Map<Ball,Integer> ballCounts = new HashMap<>() {{
            put(Ball.RED,2);
            put(Ball.GREEN,1);
            put(Ball.YELLOW,4);
            put(Ball.PURPLE,3);
        }};
        System.out.println("Balls To Catch: " + ballCounts);

        Funnel funnel = fillFunnel(ballCounts);
        System.out.println("\nFunnel: " + funnel);

        /*
         * Your solution goes below
         */
        Bucket yellow = new Bucket(Ball.YELLOW, funnel);
        Bucket red = new Bucket(Ball.RED, funnel);
        Bucket green = new Bucket(Ball.GREEN, funnel);
        Bucket purple = new Bucket(Ball.PURPLE, funnel);

        Thread  yellowThread = new Thread(yellow);
        Thread  redThread = new Thread(red);
        Thread  greenThread = new Thread(green);
        Thread  purpleThread = new Thread(purple);

        yellowThread.start();
        redThread.start();
        greenThread.start();
        purpleThread.start();
        while(true){
            if(yellowThread.isAlive() == false && redThread.isAlive() == false && greenThread.isAlive() ==false&& purpleThread.isAlive() == false){
                System.out.println("Balls Caught: ");
                System.out.println("\t" + purple.toString());
                System.out.println("\t" + green.toString());
                System.out.println("\t" + yellow.toString());
                System.out.println("\t" + red.toString());
                break;
            }
        }
        }

    /**
     * Helper method. Fills the funnel with balls.
     * 
     * @param ballCounts - a map of ball to count to add to funnel.
     * 
     * @return - a funnel randomly populated with a each type of ball.
     */
    public static Funnel fillFunnel(Map<Ball,Integer> ballCounts) {
        LinkedList<Ball> ballList = new LinkedList<>();

        for (Ball ball : ballCounts.keySet()) {
            for (int i = 0;i < ballCounts.get(ball);++i)
                ballList.add(ball);
        }

        Collections.shuffle(ballList);
        return new Funnel(ballList);
    }
}
