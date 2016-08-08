import java.util.Scanner;

public class TimeConversion {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		
		String line = in.nextLine();
		
		if (line.endsWith("AM")) {
			line = line.substring(0, line.length()-2);
			
			if (line.startsWith("12")) {
				String timeSplit[] = line.split(":");
				System.out.printf("00:%s:%s\n", timeSplit[1], timeSplit[2]);
			} else {
				System.out.println(line);
			}
		} else {
			line = line.substring(0, line.length()-2);
			String timeSplit[] = line.split(":");
			
			if (timeSplit[0].equals("12")) {
				System.out.printf("12:%s:%s\n", timeSplit[1], timeSplit[2]);
			} else {
				System.out.printf("%s:%s:%s\n", String.valueOf(12 + Integer.parseInt(timeSplit[0])), timeSplit[1], timeSplit[2]);
			}
		}
	}
}