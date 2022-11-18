package restAssuredExample;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_02_CreateUser_StaticImportFile {

	Response resp;
	
	@BeforeTest
	public void setup() {
		
		System.out.println("==========================");
	}
	
	
	@Test
	public void setupRequest() throws Exception {

//		JSONObject requestBody = new JSONObject();
//		
//		requestBody.put("name", "Rupam");
//		requestBody.put("job", "Sr. Leader");
		
		
		File file = new File("./testData/post_request.json");
		
		FileInputStream fis = new FileInputStream(file);
		String requestBody  = IOUtils.toString(fis, "UTF-8");
		
		
		baseURI = "https://reqres.in"; 						// Environment - QA/DEV/STAGE/PROD

		
		given().
			header("Content-Type", "application/json").
			body(requestBody).
			
		when().
			post("/api/users").
			
		then().
			statusCode(201).
			statusLine("HTTP/1.1 201 Created").
			body("name", equalTo("morpheus")).
			body("job", equalTo("leader")).
			log().all();
		
		

		
	}
	
	

	
}
