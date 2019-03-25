package jackson.jsontojava.jsontoJava;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava  {
	
	public static void main(String[] args) throws IOException{
		ObjectMapper mapper = new  ObjectMapper(); // create once / 재사용
		
		// Json 읽는 방법 3가지
		// File 에서 읽기
		InfoPerson person = mapper.readValue(new File("C:\\json.json"), InfoPerson.class);
		System.out.println("File  : " + person);
		// URL 에서 읽기
//		person = mapper.readValue(new URL("http://som.com/api/entry.json"),InfoPerson.class);
//		System.out.println("URL :  " + person);
		// String 으로 읽기
		person = mapper.readValue("{\"name\":\"Bob\", \"age\":20}", InfoPerson.class);
		System.out.println("String : " + person);
		
		
		
		// JSON to Java Object
		InfoPerson myResultObject = new InfoPerson();
		myResultObject.name = "rudia";
		myResultObject.age=200;
		
		// result.json 의 파일로 저장 
//		mapper.writeValue(new File("C:\\result.txt"), myResultObject);
		// byte[] 로 저장
//		byte[] jsonBytes = mapper.writeValueAsBytes(myResultObject);
		// String으로 저장
		String jsonString = mapper.writeValueAsString(myResultObject);
		System.out.println(jsonString);
		
		// 포맷팅 해 String 으로 변환할때 보기좋게.. 출력
		String jsonGoodString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myResultObject);
		System.err.println(jsonGoodString);
		
		// 포맷팅하여 파일로 저장
//		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("C:\\json.json"), myResultObject);
		
		// String 변환말고 웹요청 처리, JSON 파일로 저장시, HttpServletResponse response에 달아서 이런식으로 보내줌
		// ObjectMapper클래스의 writeValue() 메소드 사용시 OutputStream 이나 Writer에 Stream으로 출력가능
//		mapper.writeValue(response.getWriter(), myResultObject);
		
	}
	
}
