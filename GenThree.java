/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int min = Integer.parseInt(args[0]);	
		int max = Integer.parseInt(args[1]);

    int range = (max-min);
	
	int rand = (int)((Math.random() * range) + min);
	int rand1 = (int)((Math.random() * range) + min);
	int rand2 = (int)((Math.random() * range) + min);
	System.out.println(rand);
	System.out.println(rand1);
	System.out.println(rand2);

		int smallest = Math.min(Math.min(rand, rand1), Math.min(rand1,rand2));
    System.out.println("The minimal generated number was " + smallest);

}
}
