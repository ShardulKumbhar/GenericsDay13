
public class TestCase4<T extends Comparable<T>> {
	T x, y, z;

	// constructor test maximum
	public TestCase4(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max = x;// Initializing x as greater
		if (y.compareTo(max) > 0)
			max = y;// max is greater

		if (z.compareTo(max) > 0)
			max = z;// max is greater
		printMax(x, y, z, max);
		return max;

	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("\nGiven input %s %s %s \nMaximum Number is : %s\n", x, y, z, max);
	}
}