// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int numtime = Integer.parseInt(args[0]);
		String mode=args[1];
		int numnow =0;
		int index = 0;
		if (mode.equals("v")){
			System.err.println("Every one of the first " + numtime +" hailstone sequences reached 1.");
			System.err.println("");
			for (int i = 0; i < numtime; i++) {
				numnow = i + 1;
				index = 2;
				System.out.print(numnow + " ");
				if (numnow%2 == 0){
					numnow = numnow/2;
				}
				else{
					numnow = (numnow*3)+1;
				}
				System.out.print(numnow + " ");
				while(numnow != 1) {
					if (numnow%2 == 0){
						numnow = numnow/2;
					}
					else{
						numnow = (numnow*3)+1;
					}
					System.out.print(numnow + " ");
					index++;
				}
				System.out.print("(" + index + ")");
				System.err.println("");
			
			}
		}
		if (mode.equals("c")){
			System.err.println("Every one of the first " + numtime +" hailstone sequences reached 1.");
		}



	}
}
