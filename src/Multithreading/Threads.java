package Multithreading;
class thread1 extends Thread{
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
		System.out.println("thread1 input hello");
		System.out.println("thread1 input hello1");
		System.out.println("thread1 input hello2");
		System.out.println("thread1 input hello3");
	}
}

public class Threads extends Thread {
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
		System.out.println("thread2 input hello");
		System.out.println("thread2 input hello1");
		System.out.println("thread2 input hello2");
		System.out.println("thread2 input hello3");
	}
	public static void main(String[] args) {
		thread1 ob=new thread1();
		Threads ob1=new Threads();
		//ob.run();
		ob.start();;
		//ob1.run();
		ob1.start();
	}

}
