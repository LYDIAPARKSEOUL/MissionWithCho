package jackson.jsontojava.json;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import jackson.jsontojava.model.Address;
import jackson.jsontojava.model.Employee;


public class JacksonObjectMapperExample  {
	public static void main(String[] args) throws IOException  {
		//read json file data to String
				byte[] jsonData = Files.readAllBytes(Paths.get("C:\\people.txt"));
				
				//create ObjectMapper instance
				ObjectMapper objectMapper = new ObjectMapper();
				
				//convert json string to object
				Employee emp = objectMapper.readValue(jsonData, Employee.class);
				
				System.out.println("Employee Object\n"+emp);
				
				//convert Object to json string
				Employee emp1 = createEmployee();
				
				//configure Object mapper for pretty print
				objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
				
				//writing to console, can write to any output stream such as file
				StringWriter stringEmp = new StringWriter();
				objectMapper.writeValue(stringEmp, emp1);
				System.out.println("Employee JSON is\n"+stringEmp);
	}
	
	public static Employee createEmployee() {

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("CaptainMarvel");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 123456, 987654 });
		emp.setRole("Boss");

		Address add = new Address();
		add.setCity("Kyung-gi");
		add.setStreet("Sungnam-si");
		add.setZipcode(123456);
		emp.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Seoul");
		cities.add("Home");
		emp.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "10000Dallars");
		props.put("age", "40s");
		emp.setProperties(props);

		return emp;
	}

}
