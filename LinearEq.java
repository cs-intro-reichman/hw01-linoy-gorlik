/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
	double a = Integer.parseInt(args[0]);
	double c = Integer.parseInt(args[1]);
	double d = Integer.parseInt(args[2]);
	double f = d - c;
	double x = f / a;
	System.out.println(a + " " + "*" + " " + "x" + " " + "+" + " " + c + " " + "=" + " " + d);
	System.out.println("x" + " " + "=" + " " + x);
	}
}