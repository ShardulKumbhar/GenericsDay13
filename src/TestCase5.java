
public class TestCase4<T extends Comparable<T>> {
	public T a;
	public T b;
	public T c;
	public T max;

	public TestCase4() {
		this.a = a;
		this.b = b;
		this.c = c;
		this.max = max;
	}

	public <T extends Comparable<T>> T TestCase4(T a, T b, T c) // constructor
	{
		T max = a; // inital value of taken to be max
		if (b.compareTo(max) > 0) // comparing b value with max
		{
			max = b;
		}
		if (c.compareTo(max) > 0) // comparing c value with max
		{
			max = c; // max value store in max
		}
		toPrint(a, b, c, max);
		return max;

	}

	public <T> void toPrint(T a, T b, T c, T max) // to print output in format
	{
		System.out.printf("\nGiven values are: %s %s %s", a, b, c);
		System.out.println("\nMaximum Value: " + max);
	}
}
