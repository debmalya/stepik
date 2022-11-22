package stepik;

import java.util.NavigableMap;

public class NavigableMapUtil {
	/**
	 * Modify and return the given map as follows: if the first key % 2 != 0 return
	 * sub map from First Key inclusive to FirstKey+4 inclusive in descending order
	 * else return sub map from LastKey-4 inclusive to the Last Key inclusive in
	 * descending order
	 * 
	 * @param map
	 * @return
	 */

	public static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map) {

		return map.firstKey() % 2 != 0 ? map.headMap(map.firstKey() + 4, true).descendingMap()
				: map.tailMap(map.lastKey() - 4, true).descendingMap();
	}

}
