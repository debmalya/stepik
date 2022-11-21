package stepik;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class SpliteratorUtilsTest {

	@Test
	void testSpliteratorWork() {
		List<Double> lst = Arrays.asList(new Double[] { 1.0, 4.0, 8.0, 16.0, 99.0, 100.0, 110.0, 121.0 });
		List<Double> actual = SpliteratorUtils.spliteratorWork(lst);

		assertAll(() -> assertEquals(8, actual.size()));
	}

	@Test
	void testPrint() {

	}

}
