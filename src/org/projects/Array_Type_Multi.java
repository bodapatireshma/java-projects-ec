package org.projects;

public class Array_Type_Multi {
	
	public static void main(String[] args) {
		
		int [][]arr = new int [2][2];
		
		arr[0][0] = 54;
		arr[0][1] = 65;
		arr[1][0] = 25;
		arr[1][1] = 21;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j] + " ");
			}	System.out.println();
		}
		
	}

}
