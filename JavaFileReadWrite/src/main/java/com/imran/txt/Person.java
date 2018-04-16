package com.imran.txt;

public class Person{

	    int age;
	    String fname;
	    String lname;
	    String city;

	    public int getAge() {
	        return age;
	    }



	    public void setAge(int age) {
	        this.age = age;
	    }



	    public String getFname() {
	        return fname;
	    }



	    public void setFname(String fname) {
	        this.fname = fname;
	    }



	    public String getLname() {
	        return lname;
	    }



	    public void setLname(String lname) {
	        this.lname = lname;
	    }



	    public String getCity() {
	        return city;
	    }



	    public void setCity(String city) {
	        this.city = city;
	    }



	    @Override
	    public String toString() {
	        return this.age + " | " + this.fname + " | " + this.lname + " | " + this.city ;
	    }

}
