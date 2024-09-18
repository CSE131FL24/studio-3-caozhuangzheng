package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int n = in.nextInt();
	boolean [] sieve = new boolean[n];
	int i = 2;
	for (i = 2; i < n; i++) {
		sieve[i] = true;
	}
	int k =2;
	for (k=2; k < n/2; k++) {
		if(sieve[k]==true) {
			int x = 2;
			for (x=2; x< n/k; x++) {
				int y = x*k;
				sieve[y] = false;
			}
		}
		
	}
	for (int z=0; z<n; z++) {
		if(sieve[z]==true)
		System.out.println(z);
	}
		}
}