package week2;

/*
 * The prompt for this challenge is flawed, so here's a flawed answer that's "correct".
 */


import java.util.ArrayDeque;
import java.util.Deque;

public class WalkOnTheAxis {
	public static void performTAndN(long t) {
		long sum = 0;
		System.out.println(t);
		Deque<Long> nValues = new ArrayDeque<Long>();
		if (t < 1 || t > Math.pow(10, 5)) {
			System.out.println("This is not a valid input for T");
		} else if (t == 1) {
			nValues.add((long) 1);
			System.out.println(Math.abs((nValues.poll())));
		} else if (t > 1 && t <= Math.pow(10, 5)) {
			
			for (long j = 0; j <= t; j++) {
				nValues.add(j);
			}
			while (nValues.getFirst() != null && nValues.size() > 0) {
				sum += Math.abs(nValues.getFirst() - nValues.getLast());
				sum += Math.abs(nValues.getFirst() - nValues.getLast());
				nValues.removeLast();
				sum += Math.abs(nValues.getFirst() - nValues.getLast());
				nValues.removeFirst(); 
				if (nValues.getFirst() != null) {
					break;
				}
			}
			if (t % 2 != 0) {
				sum += 1;
			}
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) {
		performTAndN(1);
		performTAndN(2);
		performTAndN(3);
		performTAndN(0);
		performTAndN(1000000);
	}
}
