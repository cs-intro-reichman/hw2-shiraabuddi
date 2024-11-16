// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int numtime = Integer.parseInt(args[0]);
		String mode=args[1];
		int numnow =0;
		int index = 0;
		mode = mode.toLowerCase();
		if (mode.equals("v")){
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
				System.out.println("");
			
			}
			System.out.println("Every one of the first " + numtime +" hailstone sequences reached 1.");
		}
		if (mode.equals("c")){
			System.out.println("Every one of the first " + numtime +" hailstone sequences reached 1.");
		}



	}
}
