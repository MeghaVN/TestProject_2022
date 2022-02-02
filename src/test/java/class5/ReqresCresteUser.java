package class5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.RestAssured;

public class ReqresCresteUser {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("reRes.json");
		RestAssured
		.given()
			.body(fis)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(200);
	}

}
