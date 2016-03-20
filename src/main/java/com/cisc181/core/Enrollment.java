package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	// No-arg constructor
	private Enrollment(){
		super();
	}

	/**
	 * @param sectionID
	 * @param studentID
	 * @param enrollmentID
	 * @param grade
	 */
	public Enrollment(Section sectionID, Student studentID) {
		super();
		SectionID = sectionID.getSectionID();
		StudentID = studentID.getStudentID();
		EnrollmentID = UUID.randomUUID();
		Grade = getGrade();
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(double grade) {
		Grade = grade;
	}

	/**
	 * @return the grade
	 */
	public double getGrade() {
		return Grade;
	}
	
}
