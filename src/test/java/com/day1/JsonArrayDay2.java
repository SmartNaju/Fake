package com.day1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonArrayDay2 {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader("./src/test/resources/SampleRequest/Day2.json");
		
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(reader);
		
		JSONObject jsonObject = (JSONObject) parse;
		System.out.println(jsonObject.get("name"));
		
		Object courses = jsonObject.get("courses");
		System.out.println(courses);
		
		//to get the value inside the array
		JSONArray jsonArray =(JSONArray) courses;
		//get the value based on index
		System.out.println(jsonArray.get(0));
		// to get the all the value using for or for each loop
		for (int i = 0; i < jsonArray.size(); i++) {
		// to get the array based on index	
		Object object = jsonArray.get(i);
		// convert to json object to get indiviual value inside the array
		JSONObject jsonObject2 = (JSONObject) object;
		System.out.println(jsonObject2.get("student1"));
		System.out.println(jsonObject2.get("student2"));
		System.out.println(jsonObject2.get("student3"));
		}
	}

}
