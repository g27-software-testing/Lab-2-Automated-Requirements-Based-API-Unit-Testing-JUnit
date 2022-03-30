package org.jfree.data.test;

import junit.framework.TestCase;
import org.jfree.data.Range; 
import org.junit.*;


public class RangeTest extends TestCase {
	
	private Range rangeObjectUnderTest;

	@Before
	protected void setUp() throws Exception {
		rangeObjectUnderTest = new Range(-1, 1);
		
	}

	@After
	protected void tearDown() throws Exception {
	}

	@Test
	public void testCentralValueShouldBeZero() {
		assertEquals("The central value of -1 and 1 should be 0",	
				0, rangeObjectUnderTest.getCentralValue(), 0.000000001d);
		}
	
}
