package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	UUID SemesterID;
	Date StartDate; 
	Date EndDate;
	/**
	 * @return the semesterID
	 */
	public UUID getSemesterID() {
		return this.SemesterID;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return this.StartDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return this.EndDate;
	}
	/**
	 * @param semesterID
	 * @param startDate
	 * @param endDate
	 */
	
	public Semester(Date startDate, Date endDate) {
		super();
		SemesterID = UUID.randomUUID();
		StartDate = startDate; 
		EndDate = endDate;
	}
	/**
	 * 
	 */
	public Semester() {
		super();
	}
	
}
