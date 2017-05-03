/* 
 * Jeremy Florence
 * HW 5: Problem 1
 * MATH 671
 * 10/20/16
*/

import java.math.BigInteger;

public class PrimeFactors {
	public static void main(String [] args) {
		BigInteger n = new BigInteger(args [0]);
		BigInteger factor1 = factor(n);
		BigInteger factor2 = n.divide(factor1);
		System.out.println("The prime factors of " + n.toString() + " are: " 
												+ factor1 +	" and " + factor2);
	}
	
	public static BigInteger factor(BigInteger n) {
		BigInteger r = new BigInteger("1");
		BigInteger a = BigInteger.valueOf(2);
		BigInteger f = a.gcd(n);
		while (f.longValue() == 1) {
			r = r.add(BigInteger.valueOf(1));
			a = a.modPow(r, n);
			f = (a.subtract(BigInteger.valueOf(1))).gcd(n);
		}
		return f;
	}
	
	
}