package class9;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

public class RequestSpecificationBuilder {

	public static void main(String[] args) {
	
		
		
	RequestSpecBuilder builder = new RequestSpecBuilder();
	builder.addHeader("Authorization", "Bearer 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");
	builder.setContentType(ContentType.JSON);
	
	RestAssured.requestSpecification= builder.build();
		
		GithubCreateRepoPojo obj = new GithubCreateRepoPojo();
		obj.setName("Test1555");
		obj.setDescription("testing");
		obj.setPrivateVal(true);

		
				RestAssured
			.given()
						/*
						 * .header("Authorization", "Bearer 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")
						 * .contentType(ContentType.JSON).body(obj)
						 */
			.when()
			    .post("https://api.github.com/orgs/mvnorg/repos")
			 .then()
			 	.log().ifError()
				.statusCode(201);
	}
}
				/*.extract().as(Root.class);

		//Owner uui = rootObj.getOwner();
		Boolean val=rootObj.isPrivateVal();
		MatcherAssert.assertThat(val, Matchers.equalTo(true));
		String orgName =rootObj.getOwner().getLogin();
		MatcherAssert.assertThat(orgName, Matchers.equalToIgnoringCase("mvnorg"));*/
		

	


