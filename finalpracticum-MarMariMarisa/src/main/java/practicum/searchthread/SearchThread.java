package practicum.searchthread;

public class SearchThread implements Runnable {
    static int targetIndex = -1;
    private long toSearch[];
    private int startIndex;
    private int stopIndex;
    private long targetValue;

    public SearchThread(long toSearch[],int startIndex,int stopIndex,long targetValue){
        this.toSearch = toSearch;
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.targetValue = targetValue;
    }
    @Override
    public void run() {
        for(int i = startIndex;i<stopIndex;i++){
            System.out.println("searching");
            if(targetValue == toSearch[i]){
                System.out.println("Target value (" + targetValue + ") found at " + i);
                targetIndex = i;
            }
            if(targetIndex != -1){
                break;
            }
        }
    }

}
