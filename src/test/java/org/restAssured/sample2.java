package org.restAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI="https://reqres.in/api/users";
RequestSpecification requestSpecification = RestAssured.given()
         .body("{\r\n"
		+ "    \"name\": \"naju\",\r\n" 
		+ "    \"job\": \"smart\",\r\n"
		+ "    \"id\": \"26\",\r\n"
		+ "    \"createdAt\": \"2023-12-12T11:13:37.621Z\"\r\n"
		+ "}"); 
      Response response = requestSpecification.request(Method.POST);
      System.out.println(response.getStatusLine());
      System.out.println(response.asPrettyString());
	}

}
 