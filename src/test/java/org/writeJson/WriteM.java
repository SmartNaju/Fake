package org.writeJson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.writePojo.Airport;
import org.writePojo.Tata;
import org.writePojo.WritePojos;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojoClasses.Support;

public class WriteM {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		
		File file = new File("C:\\Program Files\\eclipse-workspace\\APIDemo\\src\\test\\resources\\Writejson\\D1write.json");
		
		ArrayList<Tata> tata = new ArrayList<Tata>();
		
		Tata t1= new Tata(7,"mubi@gmail.com" , "mubi", "begam");
		Tata t2= new Tata(7,"mubi@gmail.com" , "mubi", "begam");
		Tata t3= new Tata(7,"mubi@gmail.com" , "mubi", "begam");
		Tata t4= new Tata(7,"mubi@gmail.com" , "mubi", "begam");

		tata.add(t1);
		tata.add(t2);
		tata.add(t3);
		tata.add(t4);
		 
		Airport port = new Airport("http\naju.com", "smartnaju") ;
		
		WritePojos jo = new WritePojos(2, 6, 12, 2, tata, port);
		mapper.writeValue(file, jo);
		
		
	}

}
