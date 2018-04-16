package com.imran.txt;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class ReadWriteTxtFileAndBindWithObject {

	  public static void main(String[] args)throws Exception {
	        BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\ReadFromTxtFileAndBindWithObjectInput.txt"));

	        ArrayList<Person> list = new ArrayList<Person>();
	        Person p = null;
	        String readLine = br.readLine();

	        while(readLine != null){
	        	
	        	String [] person  = readLine.split("\\|");
	             
	            System.out.println("Array Lenth:"+person.length); 
	            System.out.println("aGE:"+person[0]);
	            
	            p = new Person();
                p.setAge(Integer.parseInt(person[0].trim()));
                p.setFname(person[1]);
                p.setLname(person[2]);
                p.setCity(person[3]);
                list.add(p);
                readLine = br.readLine();
	        }


	        FileOutputStream fout = new FileOutputStream("src\\main\\resources\\ReadFromTxtFileAndBindWithObjectOutput.txt");

	        for(Person prsn : list){
	            fout.write(prsn.toString().getBytes());
	            fout.write('\n');
	            
	            System.out.println("Object:"+prsn.toString());
	        }
	        System.out.println("DONE");

	    }

	}

