package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;
import com.cisc181.core.*;

public class Student_Test {
	Date DOB = new Date(1965, Calendar.APRIL, 6);
	Date SpringBegin = new Date(2016, Calendar.FEBRUARY, 8);
	Date SpringEnd = new Date(2016, Calendar.MAY, 16);
	Date FallBegin = new Date(2015, Calendar.AUGUST, 31);
	Date FallEnd = new Date(2015, Calendar.DECEMBER, 15);
	UUID StudentID = UUID.randomUUID();
	Course CISC181 = new Course("Intro To Computer Science II", 3);
	Course MATH535 = new Course("Partial Differential Equations", 3);
	Course SPAN107 = new Course("Spanish III: Intermediate", 4);
	Semester Spring = new Semester(SpringBegin, SpringEnd);
	Semester Fall = new Semester(FallEnd, FallBegin);
	Section CISC181_Section1_Spring = new Section(CISC181, Spring, 105);
	Section CISC181_Section2_Spring = new Section(CISC181, Spring, 106);
	Section CISC181_Section1_Fall = new Section(CISC181, Fall, 105);
	Section CISC181_Section2_Fall = new Section(CISC181, Fall, 106);
	Section MATH535_Section1_Spring = new Section(MATH535, Spring, 105);
	Section MATH535_Section2_Spring = new Section(MATH535, Spring, 106);
	Section MATH535_Section1_Fall = new Section(MATH535, Fall, 105);
	Section MATH535_Section2_Fall = new Section(MATH535, Fall, 106);
	Section SPAN107_Section1_Spring = new Section(SPAN107, Spring, 105);
	Section SPAN107_Section2_Spring = new Section(SPAN107, Spring, 106);
	Section SPAN107_Section1_Fall = new Section(SPAN107, Fall, 105);
	Section SPAN107_Section2_Fall = new Section(SPAN107, Fall, 106);
	Student Test_Student = new Student("Peter", "Davis", "Delaney", DOB, eMajor.PHYSICS, "123 LALALA Lane", "3021234567", "email@udel.edu");
	Student Test_Student_1 = new Student("Peter", "Davis", "Felaney", DOB, eMajor.PHYSICS, "123 LALALA Lane", "3021234567", "email@udel.edu");
	Student Test_Student_2 = new Student("Peter", "Davis", "Gelaney", DOB, eMajor.PHYSICS, "123 LALALA Lane", "3021234567", "email@udel.edu");
	Student Test_Student_3 = new Student("Peter", "Davis", "Helaney", DOB, eMajor.PHYSICS, "123 LALALA Lane", "3021234567", "email@udel.edu");
	Student Test_Student_4 = new Student("Peter", "Davis", "Jelaney", DOB, eMajor.PHYSICS, "123 LALALA Lane", "3021234567", "email@udel.edu");
	Student Test_Student_5 = new Student("Peter", "Davis", "Kelaney", DOB, eMajor.PHYSICS, "123 LALALA Lane", "3021234567", "email@udel.edu");
	Student Test_Student_6 = new Student("Peter", "Davis", "Lelaney", DOB, eMajor.PHYSICS, "123 LALALA Lane", "3021234567", "email@udel.edu");
	Student Test_Student_7 = new Student("Peter", "Davis", "Melaney", DOB, eMajor.PHYSICS, "123 LALALA Lane", "3021234567", "email@udel.edu");
	Student Test_Student_8 = new Student("Peter", "Davis", "Nelaney", DOB, eMajor.PHYSICS, "123 LALALA Lane", "3021234567", "email@udel.edu");
	Student Test_Student_9 = new Student("Peter", "Davis", "Pelaney", DOB, eMajor.PHYSICS, "123 LALALA Lane", "3021234567", "email@udel.edu");
	Student iteration;
	
	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		ArrayList<Course> Classes = new ArrayList<Course>();
		ArrayList<Semester> Semesters = new ArrayList<Semester>();
		ArrayList<Section> Sections = new ArrayList<Section>();
		ArrayList<Student> Students = new ArrayList<Student>();
		Classes.add(CISC181);
		Classes.add(MATH535);
		Classes.add(SPAN107);
		Semesters.add(Spring);
		Semesters.add(Fall);
		Sections.add(CISC181_Section1_Spring);
		Sections.add(CISC181_Section2_Spring);
		Sections.add(CISC181_Section1_Fall);
		Sections.add(CISC181_Section2_Fall);
		Sections.add(MATH535_Section1_Spring);
		Sections.add(MATH535_Section2_Spring);
		Sections.add(MATH535_Section1_Fall);
		Sections.add(MATH535_Section2_Fall);
		Sections.add(SPAN107_Section1_Spring);
		Sections.add(SPAN107_Section2_Spring);
		Sections.add(SPAN107_Section1_Fall);
		Sections.add(SPAN107_Section2_Fall);
		Students.add(Test_Student);
		Students.add(Test_Student_1);
		Students.add(Test_Student_2);
		Students.add(Test_Student_3);
		Students.add(Test_Student_4);
		Students.add(Test_Student_5);
		Students.add(Test_Student_6);
		Students.add(Test_Student_7);
		Students.add(Test_Student_8);
		Students.add(Test_Student_9);
		ArrayList<Double> StudentGradePoint = new ArrayList<Double>();
		ArrayList<Enrollment> EnrollmentRecords = new ArrayList<Enrollment>();
		for (int counter = 0; counter < Students.size(); counter++) { 	
			double GradeSum = 0.0;
			double GradePoints = 0.0;
			for (int counter2 = 0; counter2 < Sections.size(); counter2++){
				Enrollment added = new Enrollment(Sections.get(counter2), Students.get(counter));
				Double Grade = 75 + counter*Math.pow(-1, counter2);
				added.setGrade(Grade);
				EnrollmentRecords.add(added);
				GradeSum += Grade;
				if (Sections.get(counter2).getCourseID() == CISC181.getCourseID() || Sections.get(counter2).getCourseID() == MATH535.getCourseID()){
					GradePoints += 3.0;
				}
				else{
					GradePoints += 4.0;
				}
			}
			double GradePoint = GradeSum / (10 * GradePoints);
			StudentGradePoint.add(GradePoint);
		}   
		assertTrue(StudentGradePoint.get(0) == 2.4);
	}
}