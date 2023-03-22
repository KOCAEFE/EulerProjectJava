package Problems;

import java.util.Iterator;

/*The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
	public static void main(String[] args) {
		long maxFactor=0;
		long number=600851475143L;
		for (long i = 2; i <number; i++) {
			if(number%i==0){
				maxFactor=i;
				number=number/i;
				i--;
			}
		}
		System.out.println(maxFactor);

	}
	

}
