package testPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThread {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("google.com:1111");
		list.add("google.com:1111");
		list.add("fb.com:1111");
		MyCallable task2 = new MyCallable(list);
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future<Map> future2 = executorService.submit(task2);
		try {
			System.out.println(future2.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
