
public  class  TestRandom {
	public static void main(String[]  args) {
	    // Replace this comment with your code
		int N = Integer.parseInt(args[0]);
		int above=0;
		int below=0;
		double ratio=0.0;

		for (int i = 0; i < N; i++) {
			double random1 = Math.random();

			if (random1 <= 0.5){
				below++;
			}
			else
				above++;
			
		}
		
		if ((below == 0) || (above == 0)){
			System.out.println("> 0.5: " + above +" times");
			System.out.println("<= 0.5: " + below +" times");
		}
		else{
			if (above>below){
				ratio= (double)below/above;
				System.out.println("> 0.5: " + above +" times");
				System.out.println("<= 0.5: " + below +" times");
				System.out.println("Ratio :" + ratio);
			}
			else{
				ratio= (double)above/below;
				System.out.println("> 0.5: " + above +" times");
				System.out.println("<= 0.5: " + below +" times");
				System.out.println("Ratio :" + ratio);
			}
		}

	}
}
