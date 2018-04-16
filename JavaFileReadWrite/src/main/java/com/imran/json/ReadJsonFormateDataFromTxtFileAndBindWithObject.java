package com.imran.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

public class ReadJsonFormateDataFromTxtFileAndBindWithObject {
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
	

	   JSONParser parser = new JSONParser();
       Object obj = parser.parse(new FileReader("src\\main\\resources\\jsonEmployee.txt"));
       JSONObject jsonObject = (JSONObject) obj;
       
       String jsonObjectList = (String)jsonObject.get("employeeList").toString();
       
	   	Gson gson = new Gson();  
	   	Employee[] empArray = gson.fromJson(jsonObjectList, Employee[].class); 
		
		for(Employee obj2 : empArray) {
			
			System.out.println(obj2.getName());
			
		}
		

  }

}
