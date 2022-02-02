package class7;

import java.io.File;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

//serialization -> Java Object to JSON and pass as input in the request body-> POJO to JSON
//deserialization -> JSON to Java Object (response JSON to Java object)(POJO)-> JSON to POJO

//POJO:1.Private data members 2. Public member functions
//Jackson data bind-> extract the response body and map the response to POJO classs



public class ReqResPOST {

	public static void main(String[] args) {
		
		//String InputJson = "";
		File inputJson = new File("reRes.json");
		Root obj = RestAssured
			.given()
			.contentType(ContentType.JSON)
				.body(inputJson)
			.when()
				.post("https://reqres.in/api/users")
			.then()
				.log().all()
				.statusCode(201)
				.extract().as(Root.class);
		String name=obj.getName();
		System.out.println(name);
		MatcherAssert.assertThat(name, Matchers.equalTo("morpheus"));
		
	}

}
