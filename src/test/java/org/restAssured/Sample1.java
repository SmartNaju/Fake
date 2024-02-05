package org.restAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
public class Sample1 {

	public static void main(String[] args) {
		//request object
		RestAssured.baseURI="http://reqres.in";
		RequestSpecification requestSpecification = RestAssured.given();
		//Attach the Query parameter
		requestSpecification.queryParam("page", "2");
	
	//create the response object 
		Response response = requestSpecification.request(Method.GET,"api/users");
	
	// get the response code 
		int statusCode = response.getStatusCode();
		System.out.println(statusCode); 
		//Get the response body
		String asPrettyString = response.getBody().asPrettyString();
	System.out.println(asPrettyString);
	
	}

}


