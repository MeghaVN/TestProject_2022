package class6;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class BasicLogging {

	public static void main(String[] args) {
		RestAssured
		.given()
			.pathParam("OrgName", "mvnorg")//include path param in the request
			.queryParam("type", "private")//gets added end of he url, response has empty param becoz does not have any autorization
			.header("Authorization", "Bearer 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")
		.when()
			.log().all() //request logging
			.get("https://api.github.com/orgs/{OrgName}/repos")
		.then()
			.log().all() //response logging
			.header("Content-Type", Matchers.equalTo("application/json; charset=utf-8"))
			.body("size()", Matchers.equalTo(0))
			.statusCode(200);
	}

}
