package okhttp.test;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HeaderWays {
	public final String SAMPLE_URL = "http://localhost/rudia";  // URL주소 상수로 표현해서 재사용
	OkHttpClient client = new OkHttpClient(); // Client를 만들어줌
	
	@Test  // 요청시 헤더 설정
	public void whenSetHeader_thenCorrect() throws IOException {
	    Request request = new Request.Builder()
	      .url(SAMPLE_URL)
	      .addHeader("Content-Type", "application/json")
	      .build();
	 
	    Call call = client.newCall(request);
	    Response response = call.execute();
	    response.close();
	}
	
	@Test  //기본 헤더 설정
	@Ignore
	//"application / json" 이라는 컨텐트 유형을 설정
	public void whenSetDefaultHeader_thenCorrect() 
	  throws IOException {
	     
	    OkHttpClient client = new OkHttpClient.Builder()
	      .addInterceptor(
	        new DefaultContentTypeInterceptor())
	      .build();
	 
	    Request request = new Request.Builder()
	      .url(SAMPLE_URL)
	      .build();
	 
	    Call call = client.newCall(request);
	    Response response = call.execute();
	    response.close();
	}
}
