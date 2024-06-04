package array;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		//2D Array
		int[][] twoDimArray = new int[3][3];//3 1D array, size of the each array is 3
		twoDimArray[0][0] = 0;
		twoDimArray[0][1] = 1;
		twoDimArray[0][2] = 2;
		twoDimArray[1][0] = 3;
		twoDimArray[1][1] = 4;
		twoDimArray[1][2] = 5;
		twoDimArray[2][0] = 6;
		twoDimArray[2][1] = 7;
		twoDimArray[2][2] = 8;
		
		System.out.println("twoDimArray: " + Arrays.toString(twoDimArray));
		System.out.println(Arrays.toString(twoDimArray[0]));//prints elements of the first 1D array
		System.out.println(Arrays.toString(twoDimArray[1]));//prints elements of the second 1D array
		System.out.println(Arrays.toString(twoDimArray[2]));//prints elements of the third 1D array
		
		System.out.println("--------------------------------------------------------");
		
		int[] ages[] = {//2D array
			
				{15,20},//first 1D array
				{25,26,27},//second 1D array
				{30} //third 1D array
				
		};
		
		System.out.println("ages: " + Arrays.toString(ages));
		System.out.println(Arrays.toString(ages[0]));//prints elements of the first 1D array
		System.out.println(Arrays.toString(ages[1]));//prints elements of the second 1D array
		System.out.println(Arrays.toString(ages[2]));//prints elements of the third 1D array
		
		
		
		System.out.println("-----------------3D array-------------------------");
		//3D Arrays
		char threeDimArray[][][] = {//3D array
			
				{//first 2D array
					{'a','b','c'},//first 1D array in first 2D array
					{'d','e'} //second 1D array in first 2D array
				},
				{//second 2D array
					{'f','g'},//first 1D array in second 2D array
					{'h'},//second 1D array in second 2D array
					{'i','j','k','l'} //third 1D array in second 2D array
				}
				
		};
		
		System.out.println("threeDimArray: " + Arrays.toString(threeDimArray));
		System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[0]));
		System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[1]));
		System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[0][0]));//first 1D array in first 2D array
		System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[0][1]));//second 1D array in first 2D array
		System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[1][0]));//first 1D array in second 2D array
		System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[1][1]));//second 1D array in second 2D array
		System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[1][2]));//third 1D array in second 2D array
		

	}

}















