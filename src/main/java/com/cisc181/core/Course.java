package com.cisc181.core;

import java.util.UUID;

public class Course {
	private UUID CourseID;
	private String CourseName;  
	private int GradePoints;
	
	/**
	 * @return the courseID
	 */
	public UUID getCourseID() {
		return this.CourseID;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return CourseName;
	}
	/**
	 * @return the gradePoints
	 */
	public int getGradePoints() {
		return GradePoints;
	}
	/**
	 * @param courseID
	 * @param courseName
	 * @param gradePoints
	 */
	public Course(String courseName, int gradePoints) {
		super();
		CourseID = UUID.randomUUID();
		CourseName = courseName;
		GradePoints = gradePoints;
	}

}
