package jackson.jsontojava.javatojson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class MapListToJson {
	 public static void main(String[] args) throws Exception{
	        // 테스트 데이터 : 맵에 string 2개랑 list 하나가 들어가 있는 형태
	        List<String> list = new ArrayList<String>();
	        list.add("박");
	        list.add("루");
	        list.add("디");
	        list.add("아");
	 
	        Map<String, Object> d = new HashMap<String, Object>();
	        d.put("list임", list);
	        d.put("1", "기호1번");
	        d.put("3", "3번은누구");
	        ////////////////////////////////////////////////
	         
	        ObjectMapper om = new ObjectMapper();
	         
	        // Map or List Object 를 JSON 문자열로 변환
	        String jsonStr = om.writeValueAsString(d);
	        System.out.println("object to json : " + jsonStr);
	 
	        // JSON 문자열을 Map or List Object 로 변환
	        Map<String, Object> m = om.readValue(jsonStr, new TypeReference<Map<String, Object>>(){});
	        System.out.println("json to Map : " + m);
	        System.out.println(m.get("1"));
	        
	        // JSON 문자열을 xml 다루는것과 비슷하게 트리로 만들어 트래버싱하기(Tree Model)
	        JsonNode root = om.readTree(jsonStr);
	        
	        // 단일값 가져오기
	        System.out.println("1의 값 : " + root.path("1").getTextValue());
	         
	        // 배열에 있는 값들 가져오기
	        if( root.path("list임").isArray() ){
	            Iterator<JsonNode> it = root.path("list임").iterator();
	             
	            // 이것도 가능함
	            // Iterator<JsonNode> it = root.path("list").getElements()
	            while(it.hasNext()){
	                System.out.println(it.next().getTextValue());
	            }
	        }
	        // 이외 getXXXValue() 시리즈, findParent(), findValue() 등등 유용한 메소드 참조
	    }
}
