/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);	
		int b = Integer.parseInt(args[1]);

    int range = b-a;
	for (int x = 0; x<3; x++){
	int rand = (int)(Math.random() * range + a);
	System.out.println(rand);
	
	}


	
	   
	  
	

	}	
	
}
