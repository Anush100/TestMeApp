package Cucumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {
	Calculator cal;
	
	@Before
	public void setUp() throws Exception{
	cal=new Calculator();
	}
	@After
	public void tearDown() throws Exception{
	cal = null;
	}
	@Test
	public void testAddTwoNumbers() {
	assertEquals(12, cal.addTwoNumbers(6,6));
	}
	@Test
	public void testSubTwoNumbers() {
	assertEquals(12, cal.subTwoNumbers(12,0));
	}

}
