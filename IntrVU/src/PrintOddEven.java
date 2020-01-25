import java.util.concurrent.SynchronousQueue;

public class PrintOddEven {

Object lock;
int count=0;
int MAX;
boolean odd;
public void printOdd() {
	synchronized (this) {
		while (count < MAX) {
			System.out.println("Checking odd loop");

			while (!odd) {
				try {
					System.out.println("Odd waiting : " + count);
					wait();
					System.out.println("Notified odd :" + count);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Odd Thread :" + count);
			count++;
			odd = false;
			notify();
		}
	}
}

public void printEven() {

	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		e1.printStackTrace();
	}
	synchronized (this) {
		while (count < MAX) {
			System.out.println("Checking even loop");

			while (odd) {
				try {
					System.out.println("Even waiting: " + count);
					wait();
					System.out.println("Notified even:" + count);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Even thread :" + count);
			count++;
			odd = true;
			notify();

		}
	}
}
	public static void main(String[]args)
	{
		int i=10;
		PrintOddEven peo=new PrintOddEven();
		
		Thread even=new Thread(new Runnable()
				{
					public void run()
					{
					
						peo.printEven();
						
					}
				
					
				});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				peo.printOdd();

			}
		});
		
	}
	}

