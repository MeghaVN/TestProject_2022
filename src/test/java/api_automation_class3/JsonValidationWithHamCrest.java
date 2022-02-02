package api_automation_class3;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.path.json.JsonPath;

public class JsonValidationWithHamCrest {
	public static void main(String[] args) {
		
		JsonPath jPath = new JsonPath(new File("Response1.json"));
		int page = jPath.getInt("page");
		System.out.println(page);
		MatcherAssert.assertThat(page, Matchers.comparesEqualTo(2));
	}

}
