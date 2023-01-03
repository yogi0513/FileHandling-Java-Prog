package NaveenRealTimeJava;

import java.util.Arrays;
import java.util.Scanner;

public class P67MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a rows & column");
		int rows =sc.nextInt();
		int col = sc.nextInt();
		
		int matrixA [][] = new int [rows][col]; 
		int transposeMatrix [][] = new int [col][rows]; 
		
		System.out.println("please enter data into matrix A");
		for(int i=0;i<matrixA.length;i++) {
			for(int j=0;j<matrixA[i].length;j++) {
				matrixA [i][j]=sc.nextInt();
		
			}
		}
		
		for(int i=0;i<matrixA.length;i++) {
			for(int j=0;j<matrixA[i].length;j++) {
				System.out.print(matrixA[i][j]+" ");
			}
			System.out.println();
		}
		
		//transpose Matrix 
		
		for(int i=0;i<transposeMatrix.length;i++) {
			for(int j=0;j<transposeMatrix[i].length;j++) {
				transposeMatrix[i][j]=matrixA[j][i];     //main logic of program
		
			}
		}
		
		// printing transpose matrix
		
		System.out.println("result of transpose matrix");
		
		for(int[] ele:transposeMatrix) {
			System.out.println(Arrays.toString(ele));
		}
		
		
	}
	
	
}

/* this is known as matrix transpose --- row become column and column become row
 * 
 * input [3 4]   -- output = [3 2]
 * 		 [2 1]		   		 [4 1]
 */
