
public class Main4 {
	public static void main(String[] args) {
		System.out.println("Check maximum of three");

		// various parameters
		Integer a = 26, b = 24, c = 18;
		Float p = 1.24f, q = 2.25f, r = 0.1f;
		String x = "Apple", y = "Peach", z = "Banana";

		TestCase4.<String>testMaximum(x, y, z);
		TestCase4.<Integer>testMaximum(a, b, c);
		TestCase4.<Float>testMaximum(p, q, r);
	}

}