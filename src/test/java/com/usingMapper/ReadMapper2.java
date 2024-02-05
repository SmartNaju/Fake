package com.usingMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojoClasses.Data;
import com.pojoClasses.ReadArray3;
import com.pojoClasses.Support;

public class ReadMapper2 {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("C:\\Program Files\\eclipse-workspace\\APIDemo\\src\\test\\resources\\SampleRequest\\Raead_Array33.json");
 ReadArray3 readValue = mapper.readValue(file,ReadArray3.class);
 System.out.println(readValue.getPage());
 System.out.println(readValue.getPer_page());
 System.out.println(readValue.getTotal());
 System.err.println(readValue.getTotal_pages());
 System.out.println("------------------------");
 
 ArrayList<Data> data = readValue.getData();
 for (Data data2 : data) {
	 System.out.println(data2.getId());
	 System.out.println(data2.getEmail());
	 System.out.println(data2.getFirst_name());
	 System.out.println(data2.getLast_name());
	 System.out.println(data2.getAvatar());
	
}
 System.out.println("==================");
 Support sup = readValue.getSupport();
 System.out.println(sup.getUrl());
 System.out.println(sup.getText());
 
	}

}
