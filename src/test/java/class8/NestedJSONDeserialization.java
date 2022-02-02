package class8;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class NestedJSONDeserialization {
	public static void main(String[] args) {
		Root1 root1=RestAssured
		.given()
		.when()
				.get("https://reqres.in/api/users/2")
			.then()
					.log().all()
					.statusCode(200)
					.extract().as(Root1.class);
					
				Data dataObj=root1.getData();
		String email = dataObj.getEmail();
		System.out.println(email);
		MatcherAssert.assertThat(email, Matchers.equalTo("janet.weaver@reqres.in"));
		
		
		
			
		
	}

}
