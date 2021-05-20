package classesObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		//asignando valores a los campos de minivan
		minivan.pasajeros = 9;
		minivan.capacicdad = 15;
		minivan.kmh= 20;
		
		//calcular el rando asumiendo tanque lleno
		rango = minivan.capacicdad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numeros en pasajeros en carro es: " + carro.pasajeros);

	}

}
