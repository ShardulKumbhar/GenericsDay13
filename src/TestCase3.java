
public class TestCase3 {

	// variable declartion
	String x, y, z;

	// constructor
	public TestCase3(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// checking max of three integers
	public static String testMaximum(String x, String y, String z) {
		String max = x; // Initializing x as greater
		if (y.compareTo(max) > 0)
			max = y; // greatest is store in max

		if (z.compareTo(max) > 0)
			max = z; // greatest is store in max
		printMax(x, y, z, max);
		return max;

	}

	// printng output
	public static void printMax(String x, String y, String z, String max) {
		System.out.printf("Given input %s %s %s \nMaximum Number is : %s", x, y, z, max);

	}

}