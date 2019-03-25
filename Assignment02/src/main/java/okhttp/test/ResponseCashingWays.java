package okhttp.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.logging.impl.SimpleLog;
import org.apache.log4j.Logger;
import org.junit.Test;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ResponseCashingWays {
	static Logger logger = Logger.getLogger(SimpleLog.class);

	@Test
	public void  whenSetResponseCache_thenCorrect() 
	  throws IOException {
	    int cacheSize = 10 * 1024 * 1024;
	 
	    File cacheDirectory = new File("src/test/resources/cache");
	    Cache cache = new Cache(cacheDirectory, cacheSize);
	 
	    OkHttpClient client = new OkHttpClient()
	      .newBuilder()
	      .cache(cache)
	      .build();
	 
	    Request request = new Request.Builder()
	      .url("http://publicobject.com/helloworld.txt")
	      .build();
	 
	    Response response1 = client.newCall(request).execute();
	    logResponse(response1);
	 
	    Response response2 = client.newCall(request).execute();
	    logResponse(response2);
	    
	}
	
	public void logResponse(Response res ) {
		logger.debug(res);
	}
	
}
