package stepik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Linked {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		Arrays.stream(str.split("\\s+")).map(Integer::valueOf).collect(Collectors.toCollection(LinkedList::new))
				.stream().sorted(Comparator.reverseOrder()).skip(3).sorted(Comparator.naturalOrder())
				.forEach(System.out::println);
		Arrays.stream(reader.readLine().split(" ")).filter(x -> x.startsWith("J")).map(x -> x.substring(1))
				.collect(Collectors.toCollection(LinkedList::new)).descendingIterator()
				.forEachRemaining(System.out::println);

	}
}
