package com.cisc181.core;

public class PersonException extends Exception {
	
	Person Person;
	
	 public PersonException() {

	    }

	/**
	 * @param person
	 */
	public PersonException(com.cisc181.core.Person person) {
		super();
		Person = person;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return Person;
	}

}
