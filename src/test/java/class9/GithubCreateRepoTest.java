package class9;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class GithubCreateRepoTest {
	public static void main(String[] args) {

		// File file = new File("Repo.json");
		// Using Pojo class

		// GithubCreateRepoPojoHelper.getObj("test33", "testing..");

		GithubCreateRepoPojo obj = new GithubCreateRepoPojo();
		obj.setName("Test13");
		obj.setDescription("testing");
		obj.setPrivateVal(true);

		Root rootObj = RestAssured.given().header("Authorization", "Bearer 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")
				.contentType(ContentType.JSON).body(obj).when().post("https://api.github.com/orgs/mvnorg/repos").then()
				.log().body().statusCode(201).extract().as(Root.class);

		//Owner uui = rootObj.getOwner();
		Boolean val=rootObj.isPrivateVal();
		MatcherAssert.assertThat(val, Matchers.equalTo(true));
		String orgName =rootObj.getOwner().getLogin();
		MatcherAssert.assertThat(orgName, Matchers.equalToIgnoringCase("mvnorg"));

	}

}
