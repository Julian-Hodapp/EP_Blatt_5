package h2;

import java.util.Arrays;

public class H2_main {
	public static void main(String[] args) {
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		int n = 123;
		int digits = 0;
		
		while(n >= 1) {
			a[a.length - (digits + 1)] = n % 10;
			n = n /10;
			digits++;
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(digits);
	}
}
