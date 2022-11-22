package stepik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SpliteratorUtils {

	public static void main(String[] args) throws IOException {
		print(spliteratorWork(Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" "))
				.map(Double::parseDouble).collect(Collectors.toList())));
	}

	/**
	 * On spliteratorWork( List<Double> lst ): -using Spliterator add to
	 * List<Double> sqrts all square roots of items from lst ,if this item greater
	 * than 1 -use Math.sqrt(number) to find square root : Math.sqrt(4)-> 2.0
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static List<Double> spliteratorWork(List<Double> lst) {
		return lst.stream().filter(x -> x > 0).map(Math::sqrt).collect(Collectors.toList());
	}

	/**
	 * On print(List<Double> list): -get spliterator() of given list -divide
	 * spliterator into 2 parts ( use spliterator.trySplit()) -print all items which
	 * >=2 from first part (use .println()) -print empty string -print all items
	 * which >=10 from second part (use .println())
	 * 
	 * @param list
	 */
	public static void print(List<Double> list) {
		list.spliterator().trySplit().forEachRemaining(i -> {
			if (i >= 2)
				System.out.println(i);
		});
		System.out.println();
		list.spliterator().forEachRemaining(i -> {
			if (i >= 10)
				System.out.println(i);
		});
	}

	/**
	 * 
	 * @param set
	 * @return
	 */
	public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
		// put your code here
		return set.stream().filter(num -> num <= 10).collect(Collectors.toSet());
	}



}
