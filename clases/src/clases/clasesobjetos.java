package clases;

public class clasesobjetos{
	

	//modificador tipo de retorno
	public static  void main(String[] args) { 
		
		clasesobjetos identificadfor = new clasesobjetos();
		
		identificadfor.numero =5;
		
		System.out.println("Valor iniciar: " + identificadfor.numero);
		
		identificadfor.incrementarNumero();
		
		System.out.println("Valor actualizado: " + identificadfor.numero);
	
	}
	
	private int numero;
	
	public void incrementarNumero() {
		numero++;
		
	}
	
	
}
