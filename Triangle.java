/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);

		if ((x+y)>z) { 
		System.out.println(x + ", " + y + ", " + z +": true");
		}
		else {
        System.out.println(x + ", " + y + ", " + z +": false");
		}
		
		

	}
}
