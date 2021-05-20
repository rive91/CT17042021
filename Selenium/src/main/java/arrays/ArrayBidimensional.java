package arrays;

public class ArrayBidimensional {

	public static void main(String[] args) {
		//declarando e incializanodo el array 2D
		int arr[][] = { {2,7,9} , {3,6,1} , {7,4,2} };
		
		//La primera posicion es el Array y la Segunda posicion es la que esta dentro del array
		System.out.println(arr[0][2]);

		//imprir array 2d
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");			
			}
		System.out.println();
		}
	}

}
