package clases;
import java.util.Scanner;
public class Cociente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero");
        int Num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        int Num2 = sc.nextInt();
        int cociente = Num1/Num2;
        System.out.println("El cociente es: " + cociente);
        int resto_Sep = Num1%Num2;
        System.out.println("El resto de la operacion es : " + resto_Sep);
        double Real = (double)Num1/Num2;
        System.out.println("El resultado real es: " + Real);
	}

}