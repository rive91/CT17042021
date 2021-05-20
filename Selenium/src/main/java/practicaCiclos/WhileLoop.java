package practicaCiclos;

public class WhileLoop {

	public static void main(String[] args) {
		int a = 1;
		
		//salir cuando es mayor que 4
		while (a <= 4) {
			
			System.out.println("el valor de A: " + a);
			a++;//Incrementa el valor de 'a' para la siguiente iteracion
		}
		System.out.println("Estamos fuera del bucle while");

	}

}
