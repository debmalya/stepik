package stepik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtil {

	public static List<String> changeList(List<String> list) {
		String longestString = Collections.max(list, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		Collections.fill(list, longestString);
		return list;
	}

	public static List<String> changeList0(List<String> list) {
		// paste your code here
		int max = Integer.MIN_VALUE;
		String maxItem = "";
		List<String> withMax = new ArrayList<>();

		for (String each : list) {
			if (each != null && each.length() > max) {
				maxItem = each;
				max = each.length();
			}
		}

		for (int i = 0; i < list.size(); i++) {
			withMax.add(maxItem);
		}
		return withMax;
	}

}
