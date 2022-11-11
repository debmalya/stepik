package stepik;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MultiplicatorTest {

	@Disabled
	@Test
	void testMultiply() {
		Multiplicator multiplicator = new Multiplicator();
		Folder folder = new Folder<>();
		folder.put(new BigDecimal("10"));
		Folder[] result = multiplicator.multiply(folder, 10);
		assertNotNull(result);
		assertEquals(10, result.length);
	}

}
