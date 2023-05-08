package practicum.buckets;


public class Bucket implements Runnable {
    private Ball ball;
    private Funnel funnel;
    private int ballCount = 0;


    @Override
    public void run() {
            while(!funnel.isEmpty()){
                    if(funnel.peekAtBottom() == ball){
                        funnel.dropFromBottom();
                        ballCount++;
                    }else{
                        try{
                        Thread.sleep(1000);
                        }catch(InterruptedException ie){}
                    }
                }
    }
    public Bucket(Ball ball,Funnel funnel){
        this.ball = ball;
        this.funnel = funnel;
    }

    public Ball getBall() {
        return ball;
    }
    public int getBallCount() {
        return ballCount;
    }

    @Override
    public String toString() {
        return ball.toString() + " = " + ballCount; 
    }

}
