package clases;
import java.util.Scanner;

public class ejemploMayotMenor {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		System.out.print("Ingresar primer número: ");
		int primero = numero.nextInt();
		
		System.out.print("Ingresar segundo número: ");
		int segundo = numero.nextInt();
		
		System.out.print("Ingresar tercero número: ");
		int tercero = numero.nextInt();
		
		int mayor = Math.max(primero, Math.max(segundo, tercero));
		
		int menor = Math.min(primero, Math.min(segundo, tercero));
		
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);

	}

}
