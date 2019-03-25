package okhttp.test;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class DefaultContentTypeInterceptor implements Interceptor {
    
   public Response intercept(Interceptor.Chain chain) 
     throws IOException {

       Request originalRequest = chain.request();
       Request requestWithUserAgent = originalRequest
         .newBuilder()
         .header("Content-Type", "application/json") // Header 디폴트 컨텐트타입 설정
         .build();

       return chain.proceed(requestWithUserAgent);
   }
}