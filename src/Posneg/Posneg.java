package Posneg;

/*
 * S.Vishnu priya
 * 11-07-2017
 * PosNeg Challenge
 */
public class Posneg {

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative == true)
			if ((a < 0) && (b < 0))
				return true;
			else
				return false;
		else if (negative == false)
			if (((a < 0) && (b > 0)) || ((a > 0) && (b < 0)))
				return true;
			else
				return false;
		else
			return false;

	}

	public static void main(String args[]) {

		Posneg case1 = new Posneg();
		boolean result1 = case1.posNeg(1, -1, true);
		Posneg case2 = new Posneg();
		boolean result2 = case2.posNeg(1, -1, false);
		Posneg case3 = new Posneg();
		boolean result3 = case3.posNeg(1, 1, false);
		Posneg case4 = new Posneg();
		boolean result4 = case4.posNeg(1, 1, true);
		Posneg case5 = new Posneg();
		boolean result5 = case5.posNeg(-1, -1, false);
		Posneg case6 = new Posneg();
		boolean result6 = case6.posNeg(-1, -1, true);
		Posneg case7 = new Posneg();
		boolean result7 = case7.posNeg(-1, 1, false);
		Posneg case8 = new Posneg();
		boolean result8 = case8.posNeg(-1, 1, true);

		boolean Expected1 = new Boolean(false);
		boolean Expected2 = new Boolean(true);
		boolean Expected3 = new Boolean(false);
		boolean Expected4 = new Boolean(false);
		boolean Expected5 = new Boolean(false);
		boolean Expected6 = new Boolean(true);
		boolean Expected7 = new Boolean(true);
		boolean Expected8 = new Boolean(false);

		if (result1==Expected1)
			System.out.println("pass");
		else
			System.out.println("fail " + result1);

		if (result2==Expected2)
			System.out.println("pass");
		else
			System.out.println("fail " + result2);
		if (result3==Expected3)
			System.out.println("pass");
		else
			System.out.println("fail " + result3);

		if (result4==Expected4)
			System.out.println("pass");
		else
			System.out.println("fail " + result4);

		if (result5==Expected5)
			System.out.println("pass");
		else
			System.out.println("fail " + result5);
		if (result6==Expected6)
			System.out.println("pass");
		else
			System.out.println("fail " + result6);
		if (result7==Expected7)
			System.out.println("pass");
		else
			System.out.println("fail " + result6);
		if (result8==Expected8)
			System.out.println("pass");
		else
			System.out.println("fail " + result6);


		/*
		 * System.out.println("case1:" + result1);
		 * System.out.println("Expected : True"); System.out.println("case2:" +
		 * result2); System.out.println("Expected : False");
		 * System.out.println("case3:" + result3);
		 * System.out.println("Expected : False"); System.out.println("case4:" +
		 * result4); System.out.println("Expected : False");
		 * System.out.println("case5:" + result5);
		 * System.out.println("Expected : False"); System.out.println("case6:" +
		 * result6); System.out.println("Expected : True");
		 * System.out.println("case7:" + result7);
		 * System.out.println("Expected : True"); System.out.println("case8:" +
		 * result8); System.out.println("Expected : False");
		 */

	}
}
