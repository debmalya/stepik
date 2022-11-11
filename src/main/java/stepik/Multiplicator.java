package stepik;

import java.util.stream.Stream;

public class Multiplicator {

	public static <T extends Copy<T>> Folder<T>[] multiply(Folder<T> folder, int arraySize) {
		T master = folder.get();
		return Stream.generate(Folder<T>::new).peek(f -> f.put(master.copy())).limit(arraySize).toArray(Folder[]::new);
	}

	@SuppressWarnings("unchecked")
	public static <T extends Copy<T>> Folder<T>[] multiply0(Folder<T> folder, int arraySize) {
		// Method to implement
		Folder<T>[] folders = new Folder[arraySize];

		for (int i = 0; i < arraySize; i++) {
			Folder<T> newFolder = new Folder<>();
			newFolder.put(folder.get().copy());
			folders[i] = newFolder;
		}
		return folders;
	}
}
