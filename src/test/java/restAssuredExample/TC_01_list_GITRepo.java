package restAssuredExample;

import org.json.simple.JSONObject;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;




import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_01_list_GITRepo {

	Response resp;
	
	@BeforeTest
	public void setup() {
		
		System.out.println("==========================");
	}
	
	
	@Test
	public void setupRequest() {

		JSONObject requestBody = new JSONObject();
		
		requestBody.put("name", "");

		
		//https://api.github.com/user/repos
		
		baseURI = "https://api.github.com"; 						// Environment - QA/DEV/STAGE/PROD
															
		
		given().
			header("Content-Type", "application/json").
			contentType("JSON").
			
			//body(requestBody).
			
		when().
			get("/user/repos").
			
		then().
			statusCode(200).
			
			//body("name", equalTo("Rupam")).
			//body("job", equalTo("Leader")).
			log().all();
		
		

		
	}
	
	

	
}
