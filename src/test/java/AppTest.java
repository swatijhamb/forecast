import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testApp() {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		try {
			// Calling the main function
			App.main(new String[] { "Dubai" });

			//Checking the output should contain the location/city passed as Argument
			Assertions.assertTrue(outContent.toString().contains("Dubai"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	void testApp1() {

		try {
			// Calling the main function which prints the output
			App.main(new String[] { "London" });
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}