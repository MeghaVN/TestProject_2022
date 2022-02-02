package api_automation_class4;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GitHubRepoValidation {

	public static void main(String[] args) {

		Response res = RestAssured.get("https://api.github.com/orgs/orgch/repos");
		JsonPath jPath = res.jsonPath();
		// call size on th key which has an array

		int dataArraySize = jPath.get("size()");
		System.out.println(dataArraySize);
		
		MatcherAssert.assertThat(dataArraySize, Matchers.equalTo(15));
	}

}
