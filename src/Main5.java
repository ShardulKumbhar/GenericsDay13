
public class Main5<T extends Comparable<T>> {
	public T x, y, z;

	public Main5(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <T extends Comparable<T>> void TestCase5(T... arr) { // constructor
		T max = arr[0];
		for (int i = 1; i < arr.length; i++) { // looping till array length
			if (arr[i].compareTo(max) > 0) {
				max = arr[i]; // high value store in max
			}
			System.out.print(" " + arr[i]);
		}

		System.out.println("\nMaximum value is :" + max + "\n");
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