package stepik;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFrequency {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] words = scanner.nextLine().toLowerCase().split("\\s+");
			Arrays.stream(words).collect(Collectors.toMap(word -> word, word -> 1, Integer::sum))
					.forEach((k, v) -> System.out.println(String.format("%s %s", k, v)));

		}
	}

}
