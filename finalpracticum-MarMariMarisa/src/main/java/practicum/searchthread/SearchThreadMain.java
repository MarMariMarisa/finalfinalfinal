package practicum.searchthread;

public class SearchThreadMain {
    public static void main(String[] args) {
        long[] toSearch = SearchUtils.randomArray(1000000);
        long target = SearchUtils.TARGET_VALUE;
        SearchThread one = new SearchThread(toSearch, 0, 250000, target);
        SearchThread two = new SearchThread(toSearch, 250000, 500000, target);
        SearchThread three = new SearchThread(toSearch, 500000, 750000, target);
        SearchThread four = new SearchThread(toSearch, 750000, 1000000, target);
    
        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);
        Thread threadThree = new Thread(three);
        Thread threadFour = new Thread(four);

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }

}
