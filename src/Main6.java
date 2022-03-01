
public class Main6<T extends Comparable<T>> {
	public T x, y, z;

	public Main6(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <T extends Comparable<T>> T TestCase5(T... arr) { // constructor
		T max = arr[0];
		for (int i = 1; i < arr.length; i++) { // looping till array length
			if (arr[i].compareTo(max) > 0) {
				max = arr[i]; // high value store in max
			}
		}
		printMax(max);
		return max;
	}

	public static <T> void printMax(T max) { // print max Generic method
		System.out.println("\nMaximum is  " + max);
	}

	public static void main(String[] args) {
		System.out.println("Check maximum of three");

		Integer intArray1[] = { 3, 4, 5, 7, 8, 20, 30 }; // Test Case 1
		Float floatArray2[] = { 4.5f, 4.4f, 4.8f, 4.2f, 4.6f, 7.4f }; // Test Case 2
		String stringArray3[] = { "Apple", "Gava", "Peach", "Banana", "Chikku" }; // Test case2

		TestCase5(intArray1); // calling generic method
		TestCase5(floatArray2);
		TestCase5(stringArray3);
	}
}