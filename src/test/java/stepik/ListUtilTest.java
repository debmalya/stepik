package stepik;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListUtilTest {
	@Test
	void testChangeList() {
		List<String> actual = ListUtil.changeList(Arrays.asList(new String[] { "hi", "hello", "goodmorning", "ass" }));
		assertEquals(4, actual.size());
		for (int i = 0; i < actual.size(); i++) {
			assertEquals("goodmorning", actual.get(i));
		}
	}

	@Test
	void testChangeList0() {
		List<String> actual = ListUtil.changeList0(Arrays.asList(new String[] { "hi", "hello", "goodmorning", "ass" }));
		assertEquals(4, actual.size());
		for (int i = 0; i < actual.size(); i++) {
			assertEquals("goodmorning", actual.get(i));
		}
	}

}
