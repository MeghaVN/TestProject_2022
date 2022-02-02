package api_automation_class3;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.path.json.JsonPath;

public class JsonBodyValidations {
public static void main(String[] args) {
	JsonPath JPath = new JsonPath(new File("Response2.json"));
	String name = JPath.get("first_name");
	System.out.println(name);
	MatcherAssert.assertThat(name, Matchers.equalTo("Michael"));
	
}
}
