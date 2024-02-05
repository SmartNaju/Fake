 package com.usingMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojoClasses.Employee;

public class ReadMapper {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub
		//Create object for object mapper class
ObjectMapper objectMapper =new ObjectMapper();
// mention the path of the jason file(mapper json)
File file = new File("C:\\Program Files\\eclipse-workspace\\APIDemo\\src\\test\\resources\\SampleRequest\\Mapper.json");


Employee readValue = objectMapper.readValue(file,Employee.class);

System.out.println(readValue.getName());
System.out.println(readValue.getPhoneno());
System.out.println(readValue.getEmail());
System.out.println(readValue.getPlace());

	}

}
