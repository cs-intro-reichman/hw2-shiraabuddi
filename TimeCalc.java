public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addminutes= Integer.parseInt(args[1]);

        int totalminutes = minutes +hours*60 + addminutes;
        int newminutes = totalminutes%60;
        int newhours = 0;

        while (totalminutes>=60) {
            newhours++; 
            totalminutes = totalminutes-60;  
        }
        newhours = newhours%24;
        System.out.println(newminutes +" " +newhours);
    }
}
