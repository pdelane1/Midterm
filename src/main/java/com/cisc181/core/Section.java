package com.cisc181.core;

import java.util.UUID;

public class Section{

	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	int RoomID;
	/**
	 * @return the courseID
	 */
	public UUID getCourseID() {
		return this.CourseID;
	}
	/**
	 * @return the semesterID
	 */
	public UUID getSemesterID() {
		return this.SemesterID;
	}
	/**
	 * @return the sectionID
	 */
	public UUID getSectionID() {
		return this.SectionID;
	}
	/**
	 * @return the roomID
	 */
	public int getRoomID() {
		return RoomID;
	}
	/**
	 * @param courseID
	 * @param semesterID
	 * @param sectionID
	 * @param roomID
	 */
	public Section(Course courseID, Semester semesterID, int roomID) {
		super();
		CourseID = courseID.getCourseID();
		SemesterID = semesterID.getSemesterID();
		SectionID = UUID.randomUUID();
		RoomID = roomID;
	}

}
