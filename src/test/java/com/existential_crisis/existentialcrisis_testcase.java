/**
 * 
 */
package com.existential_crisis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class existentialcrisis_testcase {
	private dreadCollection dc;
	private dread s1;
	private dread s2;
	private dread s3;
	private dread s4;
	private final int DREAD_COLLECTION_SIZE = 4;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		//Arrange 
		dc = new dreadCollection();
		s1 = new dread("0001","I think if we were to truly create a utopian society, the first thing we would do to tear it down, just to have a purpose.");
		s2 = new dread("0002","It is closer to the year 2030 than the year 2005.");
		s3 = new dread("0003","At some point in your life, you will be the next person on Earth to die.");
		s4 = new dread("0004","Of all the consciences that could have been born in my body, I'm the one looking through these eyes.");
		
		dc.addThought(s1);
		dc.addThought(s2);
		dc.addThought(s3);
		dc.addThought(s4);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.existential_crisis.dreadCollection#getThought()}.
	 */
	@Test
	void testGetThought() {
		//Act
		List<dread> testDc = dc.getThought();
		
		//Assert
		assertTrue(!testDc.isEmpty());
		
		//Assert
		assertEquals(testDc.size(), DREAD_COLLECTION_SIZE);
	}

	/**
	 * Test method for {@link com.existential_crisis.dreadCollection#addThought(com.existential_crisis.dread)}.
	 */
	@Test
	void testAddThought() {
		dread s5 = new dread("0005","I am no longer sure of anything. If I satiate my desires, I sin but I deliver myself from them; if I refuse to satisfy them, they infect the whole soul.");
		dc.addThought(s5);
		List<dread> testDc = dc.getThought();
		int afterAddSize = DREAD_COLLECTION_SIZE + 1;
		assertEquals(testDc.size(), afterAddSize);
	}


	/**
	 * Test method for {@link com.existential_crisis.dreadCollection#findThoughtsById(java.lang.String)}.
	 */
	@Test
	void testFindThoughtsById() {
		dread findId = dc.findThoughtsById("0003");
		assertEquals("0003",findId.getId());
	}

	/**
	 * Test method for {@link com.existential_crisis.dreadCollection#findThoughtsByName(java.lang.String)}.
	 */
	@Test
	void testFindThoughtsByName() {
		dread findName = dc.findThoughtsByName("It is closer to the year 2030 than the year 2005.");
		assertEquals("It is closer to the year 2030 than the year 2005.",findName.getThought());
	}

}
