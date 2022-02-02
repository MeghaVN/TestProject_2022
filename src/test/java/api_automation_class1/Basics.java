package api_automation_class1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Basics {

	public static void main(String[] args) {
	System.out.println("hello");
	Response res = RestAssured.get("https://reqres.in/api/users/2");
	res.getStatusCode();
	System.out.println(res.getStatusCode());
	System.out.println(res.getBody().asString());
	System.out.println(res.getStatusLine());
	System.out.println((res.getHeader("content-type")));
	String responseValue = res.asString();
	System.out.println(responseValue);

	}

}
