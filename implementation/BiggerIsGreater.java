import java.util.Scanner;

public class BiggerIsGreater {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);

		int testCases = in.nextInt(); in.nextLine();

		for (int i = 0; i < testCases; i++) {
			String currentCase = in.nextLine();

			if (currentCase.length() == 1) {
				System.out.println("no answer");
			} else {
				int nonIncreasingSuffixStartIndex = getNonIncreasingSuffixIndex(currentCase);

				if (nonIncreasingSuffixStartIndex == -1) {
					System.out.println("no answer");
					continue;
				}

				currentCase = swap(nonIncreasingSuffixStartIndex, currentCase.toCharArray()); 
				currentCase = revserse(currentCase.toCharArray(), nonIncreasingSuffixStartIndex);


				System.out.println(currentCase);
			}
		} 
	}

	public static int getNonIncreasingSuffixIndex(String s) {
		for (int j = s.length()-1; j>=0; j--) {
			if (j == 0) {
				return -1;
			}

			if (s.charAt(j) > s.charAt(j-1)) {
				return j;
			} 
		}

		return -1;
	}

	/**
	* revserses the string begining the suffix index
	**/
	public static String revserse(char string[], int suffixStartIndex) {
		int j = string.length -1;

		while (suffixStartIndex < j) {
			char temp = string[j];
			string[j] = string[suffixStartIndex];
			string[suffixStartIndex] = temp;

			j--;
			suffixStartIndex++;
		}

		return new String(string);
	}

	/**
	* swap the pivot with the smallest element greater than the pivot
	* in the suffix
	**/
	public static String swap(int suffixStartIndex, char string[]) {
		int pivotIndex = suffixStartIndex - 1;

		int j;

		for (j = suffixStartIndex; j < string.length; j++) {
			if (string[pivotIndex] >= string[j]) {
				break;
			}
		}

		j--;

		char temp = string[j];
		string[j] = string[pivotIndex];
		string[pivotIndex] = temp;

		return new String(string);

	}
}