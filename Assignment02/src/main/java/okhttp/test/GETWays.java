package okhttp.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GETWays {
	
	public final String BASE_URL = "http://localhost/rudia";  // URL주소 상수로 표현해서 재사용
	
	OkHttpClient client = new OkHttpClient(); // Client를 만들어줌

	public void fail() {
		System.out.println("fail...!");
	}
	
	
	@Test  // 동기식 GET 방식
	@Ignore
	public void whenGetRequest_thenCorrect() throws IOException {
	    Request request = new Request.Builder()
	      .url( BASE_URL+ "/index") 
	      .build();
	 
	    Call call = client.newCall(request);
	    Response response = call.execute();      // 200 정상 | 404  페이지존재X
	 
	    assertThat(response.code(), equalTo(200)); // 해당 서버 연결되어있으면 success로 나옴
	}
	
	
	@Test // 비동기 GET방식
	@Ignore
	public void whenAsynchronousGetRequest_thenCorrect() {
	    Request request = new Request.Builder()
	      .url(BASE_URL + "/list")
	      .build();
	 
	    Call call = client.newCall(request);
	    call.enqueue(new Callback() {
	        public void onResponse(Call call, Response response) 
	          throws IOException {
	        	assertThat(response.code(), equalTo(200));
	        }
	        public void onFailure(Call call, IOException e) {
	            fail();
	        }
	    });
	    
	}
	
	
	@Test // 쿼리 매개변수로 GET방식
	@Ignore
	public void whenGetRequestWithQueryParameter_thenCorrect() 
	  throws IOException {
	     
	    HttpUrl.Builder urlBuilder 
	      = HttpUrl.parse(BASE_URL + "/jdbcStatement").newBuilder();
	    urlBuilder.addQueryParameter("id", "rudia"); // 파라미터로 id 추가
	 
	    String url = urlBuilder.build().toString();
	 
	    Request request = new Request.Builder()
	      .url(url)
	      .build();
	    Call call = client.newCall(request);
	    Response response = call.execute();
	 
	    assertThat(response.code(), equalTo(200));
	}
	
}
