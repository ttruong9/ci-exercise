
package CS_348_SP_2018.CIExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EndsWith1Test {

	@Test
	public void testToString() {
		EndsWith1 one = new EndsWith1();
		// add your name to the expected string, after the all the other names in the form John Smith\n
		assertEquals("EndsWith1 [names=]", one.toString());
	}

}
