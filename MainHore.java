package TenHorse;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MainHore {
	public static void main(String avgs[]){
		HorseRun[] horses  = new HorseRun[10];
		for(int i=0;i<10;i++)
			horses[i] =new HorseRun("horse"+i);
		for(int i=0; i<10; i++){
			horses[i].start();
		}
		
	}
}