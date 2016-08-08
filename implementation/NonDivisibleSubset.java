import java.util.Scanner;

public class NonDivisibleSubset {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		int array[] = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		
		int remainder[] = new int[k];

		for (int i = 0; i < array.length; i++) {
			int rem = array[i] % k;
			remainder[rem] = remainder[rem] + 1;
		}

		int count  = 0;

		if (remainder[0] > 0) {
			count++;
		}

		for (int i = 1; i < remainder.length; i++) {
			int other = k - i;

			if (other == i) {
				count++;
			} else {
				if (i < other) {
					count += Math.max(remainder[i], remainder[other]);
				}
			}

		}

		System.out.println(count);
	}
}