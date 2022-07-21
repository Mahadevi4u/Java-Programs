
class Counter{
	int count;
	public void incr() {
		for(int i=0;i<1000;i++) {
		count++;
		
		}
	}
}
	
public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				c.incr();
				
			}
			
		});
		t.start();
		t.join();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				c.incr();
				
			}
			
		});
		t1.start();
		System.out.println(c.count);

	}

}

