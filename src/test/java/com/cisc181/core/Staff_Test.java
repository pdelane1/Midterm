package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import com.cisc181.eNums.*;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Date;

public class Staff_Test {
	@SuppressWarnings("deprecation")
	Date Old_Date = new Date(1900, Calendar.APRIL, 6);
	Date Date = new Date();
	Staff employeeTest = new Staff("John", "Professor", "Doe", Date, "123 test lane", "3021234567", "test@udel.edu", "1400", 1, 35000, Date, eTitle2.PROFESSOR);
	Staff employeeTest1 = new Staff("John", "Professor", "Doe", Date, "123 test lane", "3021234566", "test@udel.edu", "1400", 1, 40000, Date, eTitle2.PROFESSOR);
	Staff employeeTest2 = new Staff("John", "Professor", "Doe", Date, "123 test lane", "3021234568", "test@udel.edu", "1400", 1, 45000, Date, eTitle2.PROFESSOR);
	Staff employeeTest3 = new Staff("John", "Professor", "Doe", Date, "123 test lane", "3021234569", "test@udel.edu", "1400", 1, 50000, Date, eTitle2.PROFESSOR);
	Staff employeeTest4 = new Staff("John", "Professor", "Doe", Date, "123 test lane", "3021234570", "test@udel.edu", "1400", 1, 55000, Date, eTitle2.PROFESSOR);
	Staff EMPLOYEE = new Staff("John", "Professor", "Doe", Date, "123 test lane", "302123456", "test@udel.edu", "1400", 1, 35000, Date, eTitle2.PROFESSOR);
	Staff EMPLOYEE2 = new Staff("John", "Professor", "Doe", Old_Date, "123 test lane", "3021234567", "test@udel.edu", "1400", 1, 35000, Date, eTitle2.PROFESSOR);
	
	@Rule
	 public final ExpectedException exception = ExpectedException.none();
	 
	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void Staff_test() {
		ArrayList<Staff> employee = new ArrayList<Staff>();
		employee.add(employeeTest);
		employee.add(employeeTest1);
		employee.add(employeeTest2);
		employee.add(employeeTest3);
		employee.add(employeeTest4);
		double salarySum = 0;
		for(Staff Employee: employee){
			salarySum = salarySum + Employee.getSalary();
		}
		double averageSalary = salarySum/5;
		assertTrue(averageSalary == 45000.00);
	}	

}