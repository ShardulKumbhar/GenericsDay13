
public class Main4 {
	public static void main(String[] args) {
		System.out.println("Check maximum of three");

		Integer a = 20, b = 40, c = 45;
		Float p = 35.15f, q = 45.50f, r = 35.25f;
		String x = "Peach", y = "Apple", z = "Banana";

		TestCase4<Integer> obj1 = new TestCase4<Integer>();
		obj1.TestCase4(a, b, c);
		TestCase4<Float> obj2 = new TestCase4<Float>();
		obj2.TestCase4(p, q, r);
		TestCase4<String> obj3 = new TestCase4<String>();
		obj3.TestCase4(x, y, z);
	}
}