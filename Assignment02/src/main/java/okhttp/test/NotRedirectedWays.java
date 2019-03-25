package okhttp.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NotRedirectedWays {
	
	@Test  // Redirects 를 따르지 않는 방법
	@Ignore
	public void whenSetFollowRedirects_thenNotRedirected() 
	  throws IOException {
	 
	    OkHttpClient client = new OkHttpClient().newBuilder()
	      .followRedirects(false) // true 로 하면 리다이렉션 되서 code 가 200이 됨
	      .build();
	     
	    Request request = new Request.Builder()
	      .url("http://t.co/I5YYd9tddw")
	      .build();
	 
	    Call call = client.newCall(request);
	    Response response = call.execute();
	 
	    assertThat(response.code(), equalTo(301));
	    // http://egloos.zum.com/itbaby/v/4280943 참고
	    // 301 
	    // 요청된 자원의 URI값이 완전히 변경되었으므로 앞으로는 새로운 URI값을 사용하여야 한다.
	    //새로운 URI값은 Location헤더를 통해서 클라이언트에게 전달된다. 또한
	    //HEAD method를 제외한 모든 경우에 response메시지의 entity body를 통해서 
	    //새로운 URI의 하이퍼링크를 포함하는 짧은 메시지를 전달해 주어야 한다. 
	    //Web브라우저는 POST method를 사용한 request의 결과로 301 status code를 
	    //전달받는 경우에는 자동으로 새로운 URI에 접속해서는 안된다. 반드시, 사용자의확인을 거쳐야 한다.
	    
	}
}
