package com.sunbeam;

public class PojoMarks {
	
	private String subjects;
	 private int marks;
	 
	 
	public PojoMarks(String subjects, int marks) {
		super();
		this.subjects = subjects;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "PojoMarks [subjects=" + subjects + ", marks=" + marks + "]";
	}
	
	
	
	
	

}
