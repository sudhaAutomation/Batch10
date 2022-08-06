package Multithreading;
class Runnable1 implements Runnable{
	public void run() {
		for (int i = 0; i <=10; i++) {
		System.out.println("Thread1 input "+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		System.out.println("thread2 input hai");
		System.out.println("thread2 input hai0000");
		System.out.println("thread2 input hai^^%&");
		
	}
}

public class Runnableinter  implements Runnable {
	public void run() {
		for (int i = 0; i <=20; i++) {
		System.out.println("Thread2 input "+i);	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		System.out.println("thread2 input hai");
		System.out.println("thread2 input hai2222");
		System.out.println("thread2 input hai888");
		
	}
	public static void main(String[] args) {
		Runnable1 r1=new Runnable1();
		Runnableinter r2=new Runnableinter();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}

}



