
public class TestCase {

	//variable declartion
	int x, y, z;

	// constructor
	public TestCase (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// checking max of three integers
	public static Integer testMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;            // Initializing x as greater
		if (y.compareTo(max) > 0)
			max = y;                 // greatest no is store in max

		if (z.compareTo(max) > 0)
			max = z;                  //greatest no is store in max
		printMax(x, y, z, max);
		return max;

	}

	//printng output
	public static void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.printf("Given input %s %s %s \nMaximum Number is : %s", x, y, z, max);

	}

}