package stepik;

import java.util.Scanner;

public class RotateARectangle {

	public static void main(String[] args) {
		// put your code here
		try (Scanner scanner = new Scanner(System.in)) {
			String[] rowColumn = scanner.nextLine().split("\\s+");
			int row = Integer.parseInt(rowColumn[0]);
			int col = Integer.parseInt(rowColumn[1]);
			int[][] arr = new int[row][col];
			int[][] converted = new int[col][row];
			for (row = 0; row < arr.length; row++) {
				arr[row] = getLine2IntArr(scanner.nextLine());

			}

			for (row = 0; row < arr.length; row++) {
				for (col = 0; col < arr[row].length; col++) {
					// System.out.println(String.format("Row - %d Col - %d Value -
					// %d",row,col,arr[row][col]));
					converted[col][row] = arr[arr.length - row - 1][col];

				}
			}

			for (row = 0; row < converted.length; row++) {
				for (col = 0; col < converted[row].length; col++) {
					System.out.print(String.format("%d ", converted[row][col]));
				}
				System.out.println();
			}
		}
	}

	private static int[] getLine2IntArr(String line) {
		String[] raw = line.split("\\s+");
		int[] arr = new int[raw.length];
		for (int i = 0; i < raw.length; i++) {
			arr[i] = Integer.parseInt(raw[i]);
		}
		return arr;
	}

}
