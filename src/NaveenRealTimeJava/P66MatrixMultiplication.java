/*
 * incomplete will complete afterwards --- watch video and do it
 * 
 */

package NaveenRealTimeJava;

import java.util.Arrays;
import java.util.Scanner;

public class P66MatrixMultiplication {

	public static void main(String[] args) {
		
		System.out.println("please enter row & column");
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		System.out.println("please enter column of second matrix");
		int colB = sc.nextInt();
		
		// 2*3 --- 3*4 -----2*4 ---- like this row and column given

		int [][] matrixA = new int [row][col];
		int [][] matrixB = new int [col][colB];
		
		int [][] result = new int [row][colB];
		
		
		System.out.println("enter data of matrix one");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrixA [i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("enter data of matrix two");
		for(int i=0;i<col;i++) {
			for(int j=0;j<colB;j++) {
				matrixB [i][j] = sc.nextInt();
				
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<colB;j++) {
				result[i][j] = matrixA[row][col]*matrixB[col][colB];
			}
		}
		
		for(int[]arr:result) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
