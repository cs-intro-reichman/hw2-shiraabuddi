// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int pi = Integer.parseInt(args[0]);
		double approximate = 1;
		double donem = 3;
		for (int i = 0; i < pi-1; i++) {
			if ((i+1)%2 == 1){
				approximate = (double)(approximate - (double)(1/(donem)));
				donem = donem +2;
			}
			else{
				approximate = (double)(approximate + (double)(1/(donem)));
				donem = donem +2;
			}
			
		}
		System.out.println("pi according to Java: " + Math.PI);


		System.out.println("pi, approximated:     " + approximate*4);

	}
}
