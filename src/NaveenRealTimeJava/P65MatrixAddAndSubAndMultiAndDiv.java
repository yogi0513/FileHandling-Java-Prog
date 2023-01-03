package NaveenRealTimeJava;

import java.util.Arrays;
import java.util.Scanner;

public class P65MatrixAddAndSubAndMultiAndDiv {
	
	public static void main(String[] args) {
	System.out.println("please enter row & column");
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		

		int [][] matrixA = new int [row][col];
		int [][] matrixB = new int [row][col];
		
		int [][] resultAddition = new int [row][col];
		int [][] resultSubtraction = new int [row][col];
		int [][] resultMultiple = new int [row][col];
		int [][] resultDivision = new int [row][col];
			
		
		System.out.println("enter data of matrix one");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrixA [i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("enter data of matrix two");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrixB [i][j] = sc.nextInt();
				
			}
		}
		
		//Addition
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				resultAddition[i][j] = matrixA[i][j]+matrixB[i][j];
			}
		}
		
		//Subtraction
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				resultSubtraction[i][j] = matrixA[i][j]-matrixB[i][j];
			}
		}
		
		//Multiple
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				resultMultiple[i][j] = matrixA[i][j]*matrixB[i][j];
			}
		}
		
		//Division
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				resultDivision[i][j] = matrixA[i][j]/matrixB[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(resultAddition));
		System.out.println(Arrays.deepToString(resultSubtraction));
		System.out.println(Arrays.deepToString(resultMultiple));
		System.out.println(Arrays.deepToString(resultDivision));
		
		
		
	}

}
