package Tandemloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class multipleCount {

	public static void main(String[] args) {
		multipleCount count = new multipleCount();
		List<Integer> input = Arrays.asList(1,2,8,9,12,46,76,82,15,20,30);
		System.out.println(input);
		
		Map<Integer, Integer> result = count.multipleCount(input);
		
		System.out.println("The output is = "+ result);
	}
	
	public Map<Integer, Integer> multipleCount(List<Integer> numbers) {
		Map<Integer, Integer> multipleCount = new HashMap<Integer, Integer>();
		
		for (int i = 1; i <= 9; i++) {
			multipleCount.put(i, 0);
			
		}
		
		for(int num: numbers) {
		for (int i = 1; i <=9; i++) {
			
			if (num % i ==0) {
				
				multipleCount.put(i, multipleCount.get(i)+1);
			}
			
		}
	}
		return multipleCount;
}
}
