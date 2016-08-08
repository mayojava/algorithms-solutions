import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveThePrisoner {
	public static void main (String args[]) throws IOException {
		Scanner in = new Scanner(System.in);

		int testCases = in.nextInt(); in.nextLine();

		for (int i = 0; i < testCases; i++) {
			String _case = in.nextLine();
			String params[] = _case.split(" ");

			int prisoners = Integer.parseInt(params[0]);
			int numberOfSweets = Integer.parseInt(params[1]);
			int startSerial = Integer.parseInt(params[2]);

			if (numberOfSweets == 1) {
				System.out.println(startSerial);
			} else {
				int warnIndex = startSerial + numberOfSweets - 1;

				if (warnIndex <= prisoners) {
					System.out.println(warnIndex);
				} else {
					int res = warnIndex%prisoners;

					res = res == 0 ? prisoners : res;

					System.out.println(res);
				}
			}

		}
	}
}