package com.csis3275.Model;

public class Group8_Model {

	int id;
	int classNumber;
	int section;
	String firstName;
	String lastName;
	String program;

	public Group8_Model(int id, int classNumber, int section, String firstName, String lastName, String program) {
		this.id = id;
		this.classNumber = classNumber;
		this.section = section;
		this.firstName = firstName;
		this.lastName = lastName;
		this.program = program;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

}
