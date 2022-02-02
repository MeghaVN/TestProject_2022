package api_automation_class4;

import org.hamcrest.MatcherAssert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class HamcrestKeyValidation {
	public static void main(String[] args) {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		JsonPath jPath=res.jsonPath();
	//	MatcherAssert.assertThat(jPath.toString(), )
	}

}
