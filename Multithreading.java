class Thread1 extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class Thread2 implements Runnable{
	public void run() {
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		System.out.println("Implementing using Runnable Interface");
	}
	
}
public class Multithreading {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t = new Thread1();
		t.start();
		t.join();
		Thread2 obj = new Thread2();
		Thread t2 = new Thread(obj);
		t2.start();
		
	  Runnable  r1 =new Runnable() {
		  public void run() {
		  for(int i=0;i<5;i++) {
			  System.out.println("Runnable");
		  }
		  }
	  };
	  Thread obj2 = new Thread(r1);
	  obj2.start();
		
	  Runnable  r2 =()->{
		  System.out.println("Lambda Expression");
		  for(int i=0;i<5;i++) {
			  System.out.println("Run");
		  }
		  
	  };
	 Thread obj3 = new Thread(r2);
	 obj3.start();
		

	}

}
