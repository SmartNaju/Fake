package com.day1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PrintJson {
	public static void main(String[] args) throws IOException, ParseException {
		/*json= javascript object notation
		 * platform indepentent
		 * REST-> Representatonal State Transfer 
		 */
		
		//1. Mention the file loaction
		FileReader reader = new FileReader("./src/test/resources/SampleRequest/Day1.json");
		
		//2/ create object for json parser
		JSONParser jsonParser = new JSONParser();
		
		Object object = jsonParser.parse(reader);
		
		//convert to json object
		JSONObject jsonObject = (JSONObject) object;
		
		Object name = jsonObject.get("name");
		System.out.println(name);
		System.out.println(jsonObject);
		System.err.println(jsonObject.get("Mobile"));
		
		//to get json object inside another json object
		
		Object address = jsonObject.get("address");
		
		// To get value form nested json object
		//convert object to json object
		JSONObject jsonObject2 = (JSONObject) address;
		System.out.println(jsonObject2.get("city"));
		
		
	}

}
