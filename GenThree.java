/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);	
		int b = Integer.parseInt(args[1]);


		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);

       // int x = Math.min ()
	   if ((c < a) | (d < a) | (e < a))
	   
	   { 
		System.out.println("mistake");
		System. exit(0);

	   }
	  if ((b < c) | (b < d) | (b < e))
      {
		System.out.println("cant");
		System. exit(0);
	}

     int small =Math.min(c, d);
	 int smallest = Math.min(small,e);
	 System.out.println(smallest);

	 System.out.println(c);
	 System.out.println(d);
	 System.out.println(e);
	 System.out.println("The minimal generated number was " + smallest);

	}	
	
}
