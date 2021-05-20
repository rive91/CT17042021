package herencia;

public class Triangulo extends DosDimensiones{
	
	String estilo;
	
	double area() {
		return base*altura/2;//Aqui se accede a las variables establecidas en la clase padre(superclase)
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}

}
