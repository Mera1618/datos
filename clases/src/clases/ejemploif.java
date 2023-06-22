package clases;

public class ejemploif {

	public static void main(String[] args) {
		int valor = 1;
		
		if( valor > 5) {
			metodo1();
		}else {
			metodo2();
		}
	}
	public static void metodo1() {
		System.out.print("El número es mayor");
	}
	
	public static void metodo2() {
		System.out.print("El número es menor");
	}

}
