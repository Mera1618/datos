package clases;
import java.util.Scanner;

public class saludo {
	
	public String nombres;
	public byte edad;
	
	public void obtenerDato() {
		Scanner dato = new Scanner(System.in);
		
		System.out.print("Ingresa tu nombre: ");
		nombres = dato.nextLine();
		
		System.out.print("Ingresa tu edad: ");
		edad = dato.nextByte();
	}

	public static void main(String[] args) {
		saludo hola = new saludo();
		hola.obtenerDato();
		
		
		System.out.print("Hola: " + hola.nombres);
		System.out.print("Tu edad es de: " + hola.edad);


	}

}
