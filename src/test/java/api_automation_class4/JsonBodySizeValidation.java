package api_automation_class4;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.path.json.JsonPath;

public class JsonBodySizeValidation {
	public static void main(String[] args) {
		JsonPath JPath = new JsonPath(new File("Response1.json"));
		int perPage=JPath.getInt("per_page");
		System.out.println(perPage);
		
		int dataArraySize=JPath.get("data.size()");
		System.out.println(dataArraySize);
		
		MatcherAssert.assertThat(dataArraySize, Matchers.equalTo(perPage));
	}

}
