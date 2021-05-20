package arrays;

public class Arrays {

	public static void main(String[] args) {
		int intArray[];
		int[] intArray2;

		//declarar un array de string.
		String[] arr;
		
		//Asignando memoria para 5
		arr = new String[5];
		
		//inicilizar el primer valor del elemento del array
		arr[0] = "cero";
		
		//inicializamos el segundo valor del elemento
		arr[1] = "uno";
		
		//consecutivamente
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		//System.out.println("el primer valor del arreglo es: " + arr[3]);
		
		//accediendo a todos los elemebtos del array
		for(int i = 0; i < arr.length; i++) { //arr.length calcula la longitud del arreglo
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}
		
	}

}
