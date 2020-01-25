import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
	
	
	
	
	
	
	public static void main(String[] args) {
		 List list=new ArrayList().add("$");
	        Map map=(Map) new HashMap().put("#","$");
	        System.out.println("Hello World"+list.get(0)+map.get("#"));
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(210);
		al.add(201);
		al.add(20);
		al.add(210);
		al.add(201);
		al.add(20);
		al.add(210);
		al.add(201);
		
		Thread t=new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 System.out.println("Return value = " + 12);
				al.add(55);

			}
		});
		t.start();
		
		Iterator it=al.iterator();
		while(it.hasNext()){
			it.next();
		}
		
        ExecutorService pool = Executors.newSingleThreadExecutor();
 
        Callable<Integer> task = new Callable<Integer>() {
            public Integer call() {
                try {
                    // fake computation time
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
 
                return 1000;
            }
        };
 
        Future<Integer> result = pool.submit(task);
 
        try {
 
            Integer returnValue = result.get();
 
            System.out.println("Return value = " + returnValue);
 
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        }
 
        pool.shutdown();
    }

}
