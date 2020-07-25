package com.epam.TDD_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirstTwoAsTest {
/*TODO list
 * “ABCD” => “BCD” 
 * “AACD” => “CD”  
 * “BACD” => “BCD” 
 * “BBAA” => “BBAA”        
 * “AABAA” => “BAA” 
 * "AAABA"=>"ABA"
 * "AAB"=>"B"
 * "AA"=>""
 * " "=>" "
 */
	RemoveFirstTwoAs removefirsttwoAs;
	
	@BeforeEach
	void setUp(){
		 removefirsttwoAs = new RemoveFirstTwoAs();
		
	}
	
	
	
	@Test
	void testABCD() {
		
		assertEquals("BCD", removefirsttwoAs.remove("ABCD"));
		
	}
	@Test
	void testAACD() {
		
		assertEquals("CD", removefirsttwoAs.remove("AACD"));
		
	}
	@Test
	void testBACD() {
		
		assertEquals("BCD", removefirsttwoAs.remove("BACD"));
		
	}
	@Test
	void testBBAA() {
		
		
		assertEquals("BBAA",removefirsttwoAs.remove("BBAA"));
		
	}
	@Test
	void testAABAA() {
		
		
		assertEquals("BAA", removefirsttwoAs.remove("AABAA"));
		
	}
	@Test
	void testAAABA() {
		
		assertEquals("ABA", removefirsttwoAs.remove("AAABA"));
		
	}
	@Test
	void testAAB() {
	
		assertEquals("B",removefirsttwoAs.remove("AAB"));
		
	}
	@Test
	void testAA() {
		
	
		assertEquals("", removefirsttwoAs.remove("AA"));
		
	}
	@Test
	void test() {
		
		
		assertEquals("", removefirsttwoAs.remove(""));
		
	}
}