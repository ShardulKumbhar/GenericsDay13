
public class TestCase2 {

	// variable declartion
	Float x, y, z;

	// constructor
	public TestCase2(float x, Float y, Float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// checking max of three integers
	public static Float testMaximum(Float x, Float y, Float z) {
		Float max = x; // Initializing x as greater
		if (y.compareTo(max) > 0)
			max = y; // greatest no is store in max

		if (z.compareTo(max) > 0)
			max = z; // greatest no is store in max
		printMax(x, y, z, max);
		return max;

	}

	// printng output
	public static void printMax(Float x, Float y, Float z, Float max) {
		System.out.printf("\nGiven input %s %s %s \nMaximum Number is : %s", x, y, z, max);

	}

}