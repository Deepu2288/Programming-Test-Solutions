package Tandemloop;

import java.util.Scanner;

public class oddNoSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no a =");
		int a = scanner.nextInt();
		
		oddNoSeries oddNoSeries = new oddNoSeries();
		
		oddNoSeries.genereteOddNo(a);
		
		scanner.close();
		
	}
	
	public void genereteOddNo(int a) {
		
		StringBuilder result= new StringBuilder();
		
		for (int i = 0; i < a; i++) {
			
			int oddNo= 2*i+1;
			
			result.append(oddNo);
			
			if (i<a-1) {
				result.append(",");
			}
			
		}
		
		System.out.println("Result = "+ result.toString());
	}
}
