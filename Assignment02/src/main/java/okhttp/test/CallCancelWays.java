package okhttp.test;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.impl.SimpleLog;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class CallCancelWays {
	static Logger logger = Logger.getLogger(SimpleLog.class);
	public final String BASE_URL = "http://localhost/rudia";
	OkHttpClient client = new OkHttpClient();
	
//	@Test(expected = IOException.class)
	@Test
	@Ignore
	public void whenCancelRequest_thenCorrect() 
	  throws IOException {
	    ScheduledExecutorService executor
	      = Executors.newScheduledThreadPool(1);
	 
	    Request request = new Request.Builder()
	      .url(BASE_URL + "/delay/2")  
	      .build();
	 
	    int seconds = 1;
	    long startNanos = System.nanoTime();
	 
	    Call call = client.newCall(request);
	 
	    executor.schedule(() -> {
	        logger.debug("Canceling call: " 
	            + (System.nanoTime() - startNanos) / 1e9f);
	 
	        call.cancel();
	        //Call.cancel () 을 사용 하면 진행중인 호출을 즉시 중지 할 수 있다. 
	        //현재 스레드가 요청을 작성 중이거나 응답을 읽는 경우 IOException 이 발생
	             
	        logger.debug("Canceled call: "
	            + (System.nanoTime() - startNanos) / 1e9f);
	         
	    }, seconds, TimeUnit.SECONDS);
	 
	    logger.debug("Executing call: "
	      + (System.nanoTime() - startNanos) / 1e9f);
	 
	    Response response = call.execute();
	    
	    logger.debug("Call was expected to fail, but completed: "  + (System.nanoTime() - startNanos) / 1e9f);
	    logger.debug(response);
	}
}