/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);	
		int b = Integer.parseInt(args[1]);

    int range = b-a;
	
	int rand = (int)(Math.random() * range + a);
	int rand1 = (int)(Math.random() * range + a);
	int rand2 = (int)(Math.random() * range + a);
	System.out.println(rand);
	System.out.println(rand1);
	System.out.println(rand2);

		int smallest = Math.min(Math.min(rand, rand1), Math.min(rand1,rand2));
System.out.println("The minimal generated number was " + smallest);



	
	   
	   { 
		// System.out.println("mistake");
		// System. exit(0);

	   }
	//   if ((b < c) | (b < d) | (b < e))
      {
		// System.out.println("cant");
		// System. exit(0);
	}

    //  int small =Math.min(c, d);
	//  int smallest = Math.min(small,e);
	//  System.out.println(smallest);

	//  System.out.println(c);
	//  System.out.println(d);
	//  System.out.println(e);
	//  System.out.println("The minimal generated number was " + smallest);

	}	
	
}
