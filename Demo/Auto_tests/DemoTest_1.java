package DemoPack_1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DemoTest_1 {

	//this part of tests for isTriangle function
	@Test
	public void test_is_triangle_1() {
		assertTrue(Demo_1.isTriangle(3, 4, 5));
	}
	
	@Test
	public void test_is_triangle_2() {
		assertTrue(Demo_1.isTriangle(3, 5, 4));
	}
	
	@Test
	public void test_is_triangle_3() {
		assertTrue(Demo_1.isTriangle(4, 3, 5));
	}
	
	@Test
	public void test_is_triangle_4() {
		assertTrue(Demo_1.isTriangle(5, 12, 13));
	}
	
	@Test
	public void test_is_triangle_5() {
		assertTrue(Demo_1.isTriangle(5, 13, 12));
	}
	
	@Test
	public void test_is_triangle_6() {
		assertTrue(Demo_1.isTriangle(12, 5, 13));
	}
	
	@Test
	public void test_is_NOT_triangle_1() {
		assertFalse(Demo_1.isTriangle(5, 7, 13));
	}
	
	@Test
	public void test_is_NOT_triangle_2() {
		assertFalse(Demo_1.isTriangle(5, 13, 7));
	}
	
	@Test
	public void test_is_NOT_triangle_3() {
		assertFalse(Demo_1.isTriangle(13, 5, 7));
	}
	
	@Test
	public void test_is_NOT_triangle_4() {
		assertFalse(Demo_1.isTriangle(5, 9, 3));
	}
	
	@Test
	public void test_is_NOT_triangle_5() {
		assertFalse(Demo_1.isTriangle(5, 3, 9));
	}
	
	@Test
	public void test_is_NOT_triangle_6() {
		assertFalse(Demo_1.isTriangle(9, 5, 3));
	}
	
	@Test
	public void test_is_NOT_triangle_7() {
		assertFalse(Demo_1.isTriangle(1, 2, -1));
	}
	
	@Test
	public void test_is_NOT_triangle_8() {
		assertFalse(Demo_1.isTriangle(1, -1, 2));
	}
	
	@Test
	public void test_is_NOT_triangle_9() {
		assertFalse(Demo_1.isTriangle(0, 0, 0));
	}
	
	
	
	//this part of tests for main function
	// input 3 4 5
	@Test
	public void main_test_is_triangle_1() {
		
		String input = "3\n4\n5\n";
		
		String ConsoleOut = "Enter side 1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 3: " + System.getProperty("line.separator");
		ConsoleOut+= "This is a triangle." + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	
	// input 4 3 5
	@Test
	public void main_test_is_triangle_2() {
		
		String input = "4\n3\n5\n";
		
		String ConsoleOut = "Enter side 1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 3: " + System.getProperty("line.separator");
		ConsoleOut+= "This is a triangle." + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	
	// input 5 12 13
	@Test
	public void main_test_is_triangle_3() {
		
		String input = "5\n12\n13\n";
		
		String ConsoleOut = "Enter side 1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 3: " + System.getProperty("line.separator");
		ConsoleOut+= "This is a triangle." + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	
	// input 0 0 0
	@Test
	public void main_test_is_NOT_triangle_1() {
		
		String input = "0\n0\n0\n";
		
		String ConsoleOut = "Enter side 1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 3: " + System.getProperty("line.separator");
		ConsoleOut+= "This is not a triangle." + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
		
	
	
	// input 1 -1 2
	@Test
	public void main_test_is_NOT_triangle_2() {
		
		String input = "1\n-1\n2\n";
		
		String ConsoleOut = "Enter side 1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 3: " + System.getProperty("line.separator");
		ConsoleOut+= "This is not a triangle." + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	// input 9 5 3
	@Test
	public void main_test_is_NOT_triangle_3() {
		
		String input = "9\n5\n3\n";
		
		String ConsoleOut = "Enter side 1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter side 3: " + System.getProperty("line.separator");
		ConsoleOut+= "This is not a triangle." + System.getProperty("line.separator");

		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	
	
	private void Invoke_main_CheckOut(String input, String ConsoleOut) {
	
		//redirect input and output into ByteArray
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		//invoke main fun
		String[] args = {};
		Demo_1.main(args);
		
		// check if the test pass or not by comparing the acutal output with expected output
		assertEquals(ConsoleOut, out.toString());
	}
	
}
