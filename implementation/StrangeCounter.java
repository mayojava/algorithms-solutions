import java.util.Scanner;

public class StrangeCounter {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);

		long t = in.nextLong();

		long time[]  = new long[40];
		long value[]  = new long[40];

		for (int i = 0; i < 40; i++) {
			long v = 3 * (long)Math.pow(2,i);

			time[i] = v - 2;
			value[i] = v;
		}


		for (int i = 0; i < 40; i++) {
			if (time[i] == t) {
				System.out.println(value[i]);
				break;
			} else if (time[i] > t) {
				long begin = time[i-1];
				long vbegin = value[i-1];

				long sub = Math.abs(begin - t);

				System.out.println(vbegin - sub);
				break;
			}
		}
	}
}