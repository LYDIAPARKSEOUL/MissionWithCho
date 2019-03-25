package okhttp.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TimeoutWays {
	
	public final String BASE_URL = "http://localhost/rudia";  
	
	@Test  // Timeout 설정
	public void whenSetRequestTimeout_thenFail() 
	  throws IOException {
	    OkHttpClient client = new OkHttpClient.Builder()
	      .readTimeout(1, TimeUnit.SECONDS)  // 시간초과..설정
	      .build();
	 
	    Request request = new Request.Builder()
	      .url(BASE_URL + "/list")
	      .build();
	  
	    Call call = client.newCall(request);
	    Response response = call.execute();
	 
	    assertThat(response.code(), equalTo(200));
	}
}
