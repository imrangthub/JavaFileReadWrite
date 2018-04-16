package com.imran.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

class Founder {  
    String name;
    int flowerCount;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFlowerCount() {
		return flowerCount;
	}
	public void setFlowerCount(int flowerCount) {
		this.flowerCount = flowerCount;
	}

}

public class JsonDataBindWithJavaObject {

public static void main(String[] args) {
		
		List<Founder> objectList = new ArrayList<Founder>();
		Founder founderObj= null;                                                                         
		
		String founderJson = "[{'name': 'Christian','flowerCount': 1}, {'name': 'Marcus', 'flowerCount': 3}, {'name': 'Norman', 'flowerCount': 2}]";

		Gson gson = new Gson();  
		Founder[] founderArray = gson.fromJson(founderJson, Founder[].class); 
		
		for(Founder obj:founderArray) {
			founderObj = new Founder();    
			founderObj.setName(obj.name);
			founderObj.setFlowerCount(obj.flowerCount);
			objectList.add(founderObj);	
		}
		
		for(Founder obj2:objectList) {
			System.out.println(obj2.getName());
		}
		
	
		

	}

}
