package class10;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import class8.Data;
import class8.Root1;
import io.restassured.RestAssured;

public class LoggingOnError {

	public static void main(String[] args) {
		RestAssured
		.given()
			.pathParam("OrgName", "mvnorg1")//include path param in the request
			.queryParam("type", "private")//gets added end of he url, response has empty param becoz does not have any autorization
			.header("Authorization", "Bearer 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")
		.when()
			.log().all() //request logging
			.get("https://api.github.com/orgs/{OrgName}/repos")
		.then()
			.log().ifError() //response logging if any issue in resonse
			//.log().ifValidationFails();//logs response only if any error in assertions
			.header("Content-Type", Matchers.equalTo("application/json; charset=utf-8"))
			.body("size()", Matchers.equalTo(0))
			.statusCode(200);
	}
		
		
		

	}


