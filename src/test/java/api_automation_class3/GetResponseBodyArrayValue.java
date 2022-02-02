package api_automation_class3;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class GetResponseBodyArrayValue {
public static void main(String[] args) {
	JsonPath jPath = new JsonPath(new File("Response1.json"));
	String  email = jPath.get("data[1].email");
	List<String> emailArray=jPath.getList("data.email");
	System.out.println(emailArray);
	System.out.println(email);
	
}
}
