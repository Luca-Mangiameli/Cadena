import java.util.Scanner;

public class Nombre {

	public static void main(String[] args) {
		Scanner string = new Scanner(System.in);
		String nombre;
		
			System.out.println("ingrese nombre");
			nombre=string.next();
			
			System.out.printf("su nombre es " + nombre);
			string.close();
	}

}
