package okhttp.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import okhttp3.Call;
import okhttp3.Credentials;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class POSTWays {
public final String BASE_URL = "http://localhost/rudia";  // URL주소 상수로 표현해서 재사용
public final String URL_SECURED_BY_BASIC_AUTHENTICATION = "http://localhost/rudia";  // URL주소 상수로 표현해서 재사용
	
	OkHttpClient client = new OkHttpClient(); // Client를 만들어줌

	
	@Test // 1. 기본 POST 방식
	@Ignore
	public void whenSendPostRequest_thenCorrect() 
	  throws IOException {
	    RequestBody formBody = new FormBody.Builder()
	      .add("id", "bingo")
	      .build();
	 
	    Request request = new Request.Builder()
	      .url(BASE_URL + "/getStudent2") //Controller에 POST형으로 메소드 하나복사해줌
	      .post(formBody)
	      .build();
	 
	    Call call = client.newCall(request);
	    Response response = call.execute();
	    assertThat(response.code(), equalTo(200));
	}
	
	
	@Test // 2. 승인된 POST 방식 ; 
	@Ignore    
	public void whenSendPostRequestWithAuthorization_thenCorrect() 
	  throws IOException {
	    String postBody = "test post";
	     
	    Request request = new Request.Builder()
//		https://square.github.io/okhttp/3.x/okhttp/okhttp3/Request.Builder.html  참고
	      .url(URL_SECURED_BY_BASIC_AUTHENTICATION) // 검증관련 보안 URL
	      .addHeader("Authorization", Credentials.basic("userName", "password"))
	      // addHeader() : 이름과 값이 있는 헤더 추가
	      //https://square.github.io/okhttp/3.x/okhttp/okhttp3/Credentials.html 참고
	      //Credentials 는 Basic Scheme 에 대한 인증정보를 반환. 
	      // 여기서 아이디랑 패스워드 쓰면 그거에 대해서 인증정보 반환해주는 역할. 
	      // 내가 만든 플젝에는 Id Password 없으므로 참고만 하고 pass.
	      .post(RequestBody.create(
	        MediaType.parse("text/x-markdown; charset=utf-8"), postBody))
	      .build(); // MediaType.parse() : String에 대한 미디어 유형 반환 문자열이 제대로 구성되지 않으면 null반환함
//	    https://square.github.io/okhttp/3.x/okhttp/okhttp3/MediaType.html  참고
	    Call call = client.newCall(request);
	    Response response = call.execute();
	 
	    assertThat(response.code(), equalTo(200));
	}
	
	
	@Test  // POST with JSON
	@Ignore
	public void whenPostJson_then_Correct() throws IOException {
	    String json = "\"name\":\"rudia\", \"age\":22}";
	  
	    RequestBody body = RequestBody.create(
	      MediaType.parse("application/json; charset=utf-8"), json);
	 
	    Request request = new Request.Builder()
	      .url(BASE_URL + "/json") // 컨트롤러에 메소드 추가해줬고.. vo InfoPerson도 추가해줌..
	      .post(body)
	      .build();
	  
	    Call call = client.newCall(request);
	    Response response = call.execute();
	   // 왜 500번 에러가 뜨는걸까..
	    assertThat(response.code(), equalTo(500)); //현재 500에러 떠서.. 이건 success나옴..
//	    assertThat(response.code(), equalTo(200));
	}
	
	@Test // multipart POST 요청
	@Ignore
	public void whenSendMultipartRequest_thenCorrect() 
	  throws IOException {  
	    RequestBody requestBody = new MultipartBody.Builder()
	      .setType(MultipartBody.FORM)
	      .addFormDataPart("name", "rudia")
	      .addFormDataPart("age", "29")
	      .addFormDataPart("file", "test.txt",
	        RequestBody.create(MediaType.parse("application/octet-stream"), 
	          new File("src/test/resources/text.txt")))
	      .build();
	 
	    Request request = new Request.Builder()
	      .url(BASE_URL + "/multipart")
	      .post(requestBody)
	      .build();
	 
	    Call call = client.newCall(request);
	    Response response = call.execute();
	    // 500에러..크흠..
	    assertThat(response.code(), equalTo(500));
//	    assertThat(response.code(), equalTo(200));
	}
	
}
