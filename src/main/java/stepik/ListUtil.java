package stepik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtil {

	public static List<String> changeList(List<String> list) {
		return Collections.nCopies(list.size(), Collections.max(list, Comparator.comparingInt(String::length)));
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

	/**
	 * Sooo this task may seem difficult , but actually it is not ! some after it
	 * become man...) your BufferedReader gets string as this : "1 2 3 4 5"
	 * 
	 * next, you must create a list of numbers from this line(ArrayList<Integer>) in
	 * the createBigList: String[] strarr = str.split(" "); - String element from
	 * given string ( "1", "2", "3", "4", "5") In for-each loop convert to Integer
	 * and add all alements from strarr to bigList -->Use Integer.parseInt(s) or
	 * Integer.valueOf(s) to convert from String to Integer return this bigList
	 * 
	 * have created three list, add the desired items in each and sort this lists in
	 * ascending order: div2List for integers that x%2=0 {2, 4} div3List for
	 * integers that x%3=0 {3} otherlist for the remaining integers {1, 5} if x%2=0
	 * and x%3=0 add x to div2List and div3List!
	 * 
	 * Sort all three lists and create List of this three lists where the first
	 * element is div2List, second - div3List and third - otherlist.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String allElements = reader.readLine();
			List<Integer> bigList = createBigList(allElements);

			ArrayList<Integer> div2list = bigList.stream().filter(i -> i % 2 == 0).sorted()
					.collect(Collectors.toCollection(ArrayList::new));

			ArrayList<Integer> div3list = bigList.stream().filter(i -> i % 3 == 0).sorted()
					.collect(Collectors.toCollection(ArrayList::new));

			ArrayList<Integer> otherlist = bigList.stream().filter(i -> i % 3 != 0 && i % 2 != 0).sorted()
					.collect(Collectors.toCollection(ArrayList::new));

			// add the necessary elements from bigList to div2list,div3list,otherlist and
			// sort all three lists

			// get result list from createListOfLists
			List<List<Integer>> resultList = createListOfLists(div2list, div3list, otherlist);

			// call printInLine() for resultList
			printInLine(resultList);
		}
	}

	private static void printInLine(List<List<Integer>> resultList) {
		// TODO Auto-generated method stub
		for (List<Integer> eachList : resultList) {
			System.out.println(eachList);
		}

	}

	public static List<Integer> createBigList(String str) {
		List<Integer> bigList = new ArrayList<Integer>();
		String[] strarr = str.split(" ");

		for (String s : strarr) {
			// convert(using Integer.parseInt(s) or Integer.valueOf(s)) and add all elements
			// from srtarr to bigList
			bigList.add(Integer.parseInt(s));
		}
		return bigList;
	}

	public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list,
			List<Integer> otherList) {
		// add all lists like items in resultList(list of lists) and return it,
		// first-div2list, second-div3list, third-otherList
		List<List<Integer>> resultList = new ArrayList<>();
		resultList.add(div2list);
		resultList.add(div3list);
		resultList.add(otherList);
		return resultList;
	}
}
