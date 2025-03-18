package javaday1pgm;



import java.util.Arrays;



public class arrays {

	public static void main (String[] args) {

		

		//single demonsial array

		/* int[] num=new int[5];

		num[0]=10;

		num[1]=20;

		num[2]=30;

		num[3]=40;

		num[4]=50;

		//System.out.println(num[0]);

		for (int i=0; i<num.length;i++) {

			System.out.println(num[i]);

		}*/

		

		//multidemonsial array

		

		/*int[][] matrix = new int[2][3];//decalre a 2*3 arra

		matrix[0][0]=1; matrix[0][1]=2;  matrix[0][2]=3;

		matrix[1][0]=4;  matrix[1][1]=5; matrix[1][2]=6;

		for(int i=0; i<matrix.length; i++) {

			for(int j=0; j<matrix[i].length; j++) {

				System.out.println(matrix[i][j]+" ");

				

			}

			System.out.println();

			

		} */

		

		//array copy method

		/*int[] source = {1,2,3,4,5};

		int[] destination=new int[5];

		//copy array

		System.arraycopy(source, 0, destination, 0, source.length);

		for(int num:destination) {

			System.out.print(num+ "");

			

		}*/

		

		

		//array sort

		int[] number = {40 ,10 ,30 ,20 ,50 ,60};

		//sort array

		Arrays.sort(number);

		System.out.println("sorted array:"+Arrays.toString(number));

		

		

		

		for(int num : number) {

			System.out.print(num);

			

		}

		

		

		

		

		

		

	}



}

