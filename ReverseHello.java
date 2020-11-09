package assignment7;

public class ReverseHello extends Thread {

	static final int MAX_THREADS = 50;
	static final int FIRST_THREAD = 1;
	private int counter;
	
    public ReverseHello(int Counter) {
    	this.counter = Counter;
    }
    
    @Override
    public void run() {	
    	try {
    		if (counter <= MAX_THREADS) {
    			startNewThread(counter++);
    		}
    	} catch (Exception ex) {
    		System.out.println(ex.toString());
    	}
    	
    }
    
    public void startNewThread(int Counter) throws InterruptedException{
    	ReverseHello reverseHelloThread = new ReverseHello(counter);
		reverseHelloThread.start();
		reverseHelloThread.join();
		System.out.println(String.format("Hello from %s !", getName() ));
    }
    
    public static void main(String[] args) throws InterruptedException {		
    	ReverseHello firstThread = new ReverseHello(FIRST_THREAD);
		firstThread.start();
	}
}
