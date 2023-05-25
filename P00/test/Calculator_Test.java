import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculator_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
	       //arrange
		int a = 4321;
		int b = 1234;
		
	       //act	
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
		
	       //assert	 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual,expected);
	}
	@Test
	public final void testMultiply() {
		int a = 5;
		int b = 100;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 500;
		assertEquals(actual,expected);
	}
	@Test
	public final void testDivide() {
		int a = 1520;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 760;
		assertEquals(actual,expected);
	}

}
