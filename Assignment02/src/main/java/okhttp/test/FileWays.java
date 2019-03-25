package okhttp.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class FileWays {
	public final String BASE_URL = "http://localhost/rudia";  // URL주소 상수로 표현해서 재사용
	OkHttpClient client = new OkHttpClient(); // Client를 만들어줌

	@Test  // 파일 올리기 
	@Ignore 
	public void whenUploadFile_thenCorrect() throws IOException {
	    RequestBody requestBody = new MultipartBody.Builder()
	      .setType(MultipartBody.FORM)
	      .addFormDataPart("file", "file.txt",
	        RequestBody.create(MediaType.parse("application/octet-stream"), 
	          new File("src/test/resources/text.txt")))
	      .build();
	 
	    Request request = new Request.Builder()
	      .url(BASE_URL + "/list")
	      .post(requestBody)
	      .build();
	 
	    Call call = client.newCall(request);
	    Response response = call.execute();
	 
	    assertThat(response.code(), equalTo(200)); // success
	}
	
	
}
