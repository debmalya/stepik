package stepik;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NavigableMap;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class NavigableMapUtilTest {

	@Test
	void testGetSubMapFirstPart() {
		NavigableMap<Integer, String> map = new TreeMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		NavigableMap<Integer, String> subMap = NavigableMapUtil.getSubMap(map);
		assertAll(() -> assertEquals(5, subMap.size()), () -> assertTrue(5 == subMap.firstKey()),
				() -> assertTrue(1 == subMap.lastKey()));
		System.out.println(subMap);

	}

	@Test
	void testGetSubMapLastPart() {
		NavigableMap<Integer, String> map = new TreeMap<>();
		map.put(6, "six");
		map.put(4, "four");
		map.put(2, "two");
		map.put(14, "fourteen");
		map.put(10, "ten");

		NavigableMap<Integer, String> subMap = NavigableMapUtil.getSubMap(map);
		assertAll(() -> assertEquals(2, subMap.size()),
				() -> assertTrue(14 == subMap.firstKey(), String.format("Expected 14 but found %d", subMap.firstKey())),
				() -> assertTrue(10 == subMap.lastKey()));
		System.out.println(subMap);

	}

}
