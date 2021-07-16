package DemoPack_2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DemoTest_2 {

	
	// this part of tests for main function
	// input 1
	@Test
	public void mainTestInput_1() {
		
		String input = "1\n";
		
		String ConsoleOut = "Enter the redius: " + System.getProperty("line.separator");
		ConsoleOut+= "For the Circle that redius is : 1.0" + System.getProperty("line.separator");
		ConsoleOut+= "The Circum is : 6.283185307179586" + System.getProperty("line.separator");
		ConsoleOut+= "The Area is : 3.141592653589793" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	
	// input 0
	@Test
	public void mainTestInput_2() {
		
		String input = "0\n";
		
		String ConsoleOut = "Enter the redius: " + System.getProperty("line.separator");
		ConsoleOut+= "For the Circle that redius is : 0.0" + System.getProperty("line.separator");
		ConsoleOut+= "The Circum is : 0.0" + System.getProperty("line.separator");
		ConsoleOut+= "The Area is : 0.0" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	
	
	// input -1
	@Test
	public void mainTestInput_3() {
		
		String input = "-1\n";
		
		String ConsoleOut = "Enter the redius: " + System.getProperty("line.separator");
		ConsoleOut+= "The raduis must be positive!!" + System.getProperty("line.separator");
		
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
		Demo_2.main(args);
		
		// check if the test pass or not by comparing the acutal output with expected output
		assertEquals(ConsoleOut, out.toString());
	}
}
