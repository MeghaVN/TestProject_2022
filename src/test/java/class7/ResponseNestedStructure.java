package class7;


import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ResponseNestedStructure {
	public static void main(String[] args) {
		JsonPath jPath=RestAssured
				.given()
					.pathParam("OrgName", "orgch")//include path param in the request
					//.queryParam("type", "private")//gets added end of he url, response has empty param becoz does not have any autorization
					//.header("Authorization", "Bearer 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")
				.when()
					.log().all() //request logging
					.get("https://api.github.com/orgs/{OrgName}/repos")
				.then()
					.log().all() //response logging
					.statusCode(200)
					.root("owner[0]")
					.extract().jsonPath();
					
				
			int responseCount	=jPath.get("size()");
			
	}

	
}

