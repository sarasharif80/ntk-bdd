package com.noorteck.qa.api;

import static io.restassured.RestAssured.given;

import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PutDemo {
	public static void main(String[] args) {
		String uri = "https://reqres.in/api/users/2";
		String bodyStr = "{\"name\":\"SARA\", \"job\":\"SDET\",\"updatedAt\":\"2020-08-04T23:56:06.633Z\"}";
		
		//Response object
		Response response;
		
		
		response = 	given()
						.queryParam("city", "Reston")
						.header("x-rapidapi-host", "restcountries-v1.p.rapidapi.com")
						.header("x-rapidapi-key", "b42bf2a0f0msh9f2ced883e4e79ep1c821bjsn899a3c43ec0c")
						.contentType(ContentType.JSON)
						.body(bodyStr)
				
					.when()
						.put(uri)
					.then()
						.extract()
						.response();
					
		
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(200, response.getStatusCode());
		
		JsonPath jsonPath = response.jsonPath();
		
		softAssert.assertEquals(jsonPath.getString("name"),"SARA");
		softAssert.assertEquals(jsonPath.getString("job"),"SDET");
		softAssert.assertTrue(jsonPath.getString("updatedAt").contains("2020"));
		softAssert.assertAll();
	}

}
