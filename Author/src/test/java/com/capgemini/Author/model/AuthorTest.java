package com.capgemini.Author.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * 
 * @author Roshma
 *
 */



class AuthorTest {

	static Author auth;
	Author auth1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.out.println("Before all cases this is happening");
	auth=new Author("diya","diya@xyz.com",'f');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all cases this is happening");
		auth=null;  //eligible for garbage collector
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test case this is happening");
		auth1=new Author();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test case this is happening");
		auth1=null;
	}

	
	@Test
	void testAuthor() {
		assertEquals(new Author(),auth1);
	}

	
	/**
	 *  Test method for {@link com.capgemini.author.model.Author#getName()}.
	 */
	@Test
	void testGetName() {
		assertEquals("diya",auth.getName());
	}


	/**
	 *  Test method for {@link com.capgemini.author.model.Author#getEmail()}.
	 */
	@Test
	void testGetEmail() {
		assertEquals("diya@xyz.com",auth.getEmail());
	}

	

	/**
	 * Test method for {@link com.capgemini.author.model.Author#getGender()}.
	 */
	@Test
	void testGetGender() {
		assertEquals('f',auth.getGender());
	}

}
