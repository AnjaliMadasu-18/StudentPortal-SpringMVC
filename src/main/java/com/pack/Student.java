
package com.pack;

public class Student {

    private int id;
    private String fname;
    private String lname;
    private String email;
    private int age;
    private String city;
    private String state;

    // Default Constructor
    public Student() {
    }

    // Getters and Setters

    

	public int getId() {
        return id;
    }

    public Student(int id, String fname, String lname, String email, int age, String city, String state) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.age = age;
		this.city = city;
		this.state = state;
	}

	public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
