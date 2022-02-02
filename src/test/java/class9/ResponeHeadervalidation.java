package class9;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

public class ResponeHeadervalidation {
	
public static void main(String[] args) {
	
	
	//Response Specification builder , automatically validates the response , before the response is generated the builder will build the 
	ResponseSpecBuilder builder = new ResponseSpecBuilder();
	builder.expectHeader("Server", Matchers.equalTo("GitHub.com"));
	builder.expectHeader("Content-Type", Matchers.equalTo("application/json; charset=utf-8"));
	
	RestAssured.responseSpecification = builder.build();
	
	GithubCreateRepoPojo obj = new GithubCreateRepoPojo();
	obj.setName("Test14");
	obj.setDescription("testing");
	obj.setPrivateVal(true);

	Root rootObj = 
			RestAssured
		.given()
			.header("Authorization", "Bearer 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")
			.contentType(ContentType.JSON).body(obj)
		.when()
		    .post("https://api.github.com/orgs/mvnorg/repos")
		 .then()
		 	.log().ifError()
			.statusCode(201)
			.extract().as(Root.class);

	//Owner uui = rootObj.getOwner();
	Boolean val=rootObj.isPrivateVal();
	MatcherAssert.assertThat(val, Matchers.equalTo(true));
	String orgName =rootObj.getOwner().getLogin();
	MatcherAssert.assertThat(orgName, Matchers.equalToIgnoringCase("mvnorg"));
	
	
}
}
