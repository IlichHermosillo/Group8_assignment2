package com.csis3275.Model;

public class Group8_Model {

	private String firstName;
	private String lastName;
	private int id;
	private int classNumber;
	private int section;
	private String program;

	public Group8_Model(String firstName, String lastName, int id, int classNumber, int section, String program) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.classNumber = classNumber;
		this.section = section;
		this.program = program;
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

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

}
