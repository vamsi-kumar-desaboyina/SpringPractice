package com.main;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List<String> skills;
	private Set<String> documents;
	private Map<String,Integer> marks;
	public Employee()
	{
		
	}
	
	public Employee(int id, String name, List<String> skills, Set<String> documents, Map<String, Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.documents = documents;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	

	public Set<String> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<String> documents) {
		this.documents = documents;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", skills=" + skills + ", documents=" + documents + ", marks="
				+ marks + "]";
	}

	
	
	
}
