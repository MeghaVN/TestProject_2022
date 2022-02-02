package class5;

import io.restassured.RestAssured;

public class FirstRestAssured {

	public static void main(String[] args) {

		RestAssured.given().when().get("https://api.github.com/orgs/orgch/repos").then().statusCode(201);
		// method chaining-> if method returns object of a class and can other method in
		// the same class

		RestAssured.given().when().get("\"https://api.github.com/orgs/orgch/repos\"").then().statusCode(200);

	}

}
