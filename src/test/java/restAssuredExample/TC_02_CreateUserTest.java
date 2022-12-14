package restAssuredExample;

import org.json.simple.JSONObject;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_02_CreateUserTest {

	Response resp;
	
	@Test
	public void setupRequest() {

		
//		{
//		    "name": "morpheus",
//		    "job": "leader"
//		}
		
		
		JSONObject requestBody = new JSONObject();
		
		requestBody.put("name", "Rupam");
		requestBody.put("job", "Sr. Leader");
		
		
		System.out.println(requestBody.toJSONString());
		
		// BaseURI
		RestAssured.baseURI = "https://reqres.in"; // Environment - QA/DEV/STAGE/PROD

		// Request Object
		RequestSpecification httpRequest = RestAssured.given();
		// header
		httpRequest.header("Content-Type", "application/json");
		// parameter
		// auth token
		//body
		
		httpRequest.body(requestBody);
		
		
		
		
//		list ------ header, body, authToken
		
		
		
		
		// Response Object
		resp = httpRequest.request(Method.POST, "/api/users"); // request sent to server
		
		System.out.println(resp.getBody().asPrettyString());
		
	}
	
	

//	//@Test
//	public void verifyListUserTest() {
//
////		System.out.println(resp.asString());
////		System.out.println(resp.asPrettyString());
//
//		System.out.println(resp.getContentType()); // application/json; charset=utf-8
//		System.out.println(resp.getHeader("Content-Type")); // application/json; charset=utf-8
//		System.out.println(resp.getStatusCode()); // 200
//		System.out.println(resp.getStatusLine()); // HTTP/1.1 200 OK
//		System.out.println(resp.getTime()); // Response Time
//		System.out.println(resp.getBody().asPrettyString()); // body
//		System.out.println(resp.getHeader("X-Powered-By")); // Express
//
//	}
	
	
}
