package com.noorteck.qa.api;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;

public class RefactorAPI {
	
	public static void main(String[] args) {
	
		String uri = "https://us-zipcode.api.smartystreets.com/lookup";
		
		Map<String,String>queryMap =new HashMap<String,String>();
		
		queryMap.put("auth-id", "61f926d0-4996-13a8-c0ff-be05d212a694");
		queryMap.put("auth-token", "Vhz4zNp7uJ7BMq4BTTmm");
		queryMap.put("city", "reston");
		queryMap.put("state", "VA");
		queryMap.put("zipcode", "20190");
		
		//create response obj
				Response response;


				response = given()
						.queryParams(queryMap)
								
						   .when()
						   		.get(uri)
						   .then()
						   		.extract()
						   		.response();
				
				
				response.prettyPrint();
				
				System.out.println(response.getStatusCode());
	}

}
