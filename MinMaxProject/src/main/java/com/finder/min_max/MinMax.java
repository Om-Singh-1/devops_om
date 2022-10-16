package com.finder.min_max;

public class MinMax{

	public int max_finder(int[] num, int total) {
		
		int temp;
		
		for(int i = 0; i < total; i++) {
			
			for(int j = i + 1; j < total; j++) {			// sheesh so much code if just max() ,
															// would've been allowed :(	
				if(num[i] > num[j]) {
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}
				
			}
			
		}
		
		return num[total - 1];
		
	}
	
	public int min_finder(int[] num, int total) {
		
		int temp;
		
		for(int i = 0; i < total; i++) {
			
			for(int j = i + 1; j < total; j++) {
				
				if(num[i] < num[j]) {
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}
				
			}
			
		}
		
		return num[total - 1];
		
	}
	
	public static void main(String[] args) {
		
		MinMax number = new MinMax();

		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 69};
		
		Runnable task_one = () -> {
			System.out.println("Smallest number among provided numbers is: " + number.min_finder(numbers, 10));
		};
		
		Runnable task_two= () -> {
			System.out.println("Largest number among provided numbers is: " + number.max_finder(numbers, 10));	
		};
		
		new Thread(task_one).start();
		new Thread(task_two).start();
		
	}

}