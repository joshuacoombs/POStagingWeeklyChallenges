package week1;

public class PerfectNumber {
	public static boolean ifPerfect(int n) {
		int i = 1;
		int result = 0;
		
		while (i <= (n / 2)) {
			if (n % i == 0) {
				result += i;
			}
		}
		
		if (result == n) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(ifPerfect(97));
		System.out.println(ifPerfect(12));
		System.out.println(ifPerfect(496));
		System.out.println(ifPerfect(28));
		System.out.println(ifPerfect(6));
	}
}
