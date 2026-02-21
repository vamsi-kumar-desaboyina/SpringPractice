package com;

public class Employee {
	
	private int eid;
	private String ename;
	private String eemail;
	private double esalary;
	private int eage;
	public Employee()
	{
		
	}
	public Employee(int eid, String ename, String eemail, double esalary, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eemail = eemail;
		this.esalary = esalary;
		this.eage = eage;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", esalary=" + esalary + ", eage="
				+ eage + "]";
	}
}
