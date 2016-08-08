import java.util.Scanner;

public class CircularArrayRotation {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		
		String fline = in.nextLine();
		String flineSplit[] = fline.split(" ");
		
		int rotation_count = Integer.parseInt(flineSplit[1]);
		int query_count = Integer.parseInt(flineSplit[2]);
		
		//read array input into a string
		String arrayInputString = in.nextLine();
		String arrayInput[] = arrayInputString.split(" ");
		
		int queries[] = new int[query_count];
		for (int j = 0; j < query_count; j++) {
			queries[j] = in.nextInt();
		}
		
		String newString[] = new String[arrayInput.length];
		
		for (int j = 0; j < arrayInput.length; j++) {
			int newPos = (j + rotation_count) % arrayInput.length;
			newString[newPos] = arrayInput[j];
		}
		
		for (int i = 0; i < queries.length; i++) {
			System.out.println(newString[queries[i]]);
		}
	}
}