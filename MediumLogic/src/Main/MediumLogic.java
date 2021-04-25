package Main;

public class MediumLogic {

	public static void main(String[] args) {
		System.out.println(closeFar(5, 1, 10));
		System.out.println(makeChocolate(5, 1, 10));
	}

	// closeFar
	// Given three ints, a b c, return true if one of b or c is "close" (differing
	// from a by at most
	// 1), while the other is "far", differing from both other values by 2 or more.
	// Note:
	// Math.abs(num) computes the absolute value of a number.
	public static boolean closeFar(int a, int b, int c) {
		if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
			return true;
		} else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
			return true;
		} else {
			return false;
		}
	}

	// makeChocolate
	// Make a package of goal kilos of chocolate. Use small bars (1 kilo each) and big bars (5 kilos each).
	// Return the number of small bars to use, assuming we always use big bars before small bars.
	// Return -1 if it can't be done.
	public static int makeChocolate(int small, int big, int goal) {
		int sum = 0;
		if ((goal%5) == 0 && goal <= (big*5)) return 0;
		for (int i = 5; i < goal; i += 5) sum = i;
		if (sum > (big*5)) sum = big * 5;
		if ((goal - sum) <= small) return goal - sum;
		return -1;
	}
}
