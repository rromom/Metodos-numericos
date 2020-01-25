package proyecto;

import java.util.*;;

public class Menu {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new java.util.Scanner(System.in);
		
		int opc=-1;
		while (opc!=0) {
			System.out.println("1. Metodo de Gauss Jordan");
			System.out.println("2. Metodo de Biseccion");
			System.out.println("3. Metodo de la Secante");
			System.out.println("4. Metodo de Lagrange");
			System.out.println("0. Salir");
			try {
				System.out.println("Ingrese la opcion");
				opc=teclado.nextInt();
			} catch (Exception e) {
				System.out.println("Error de entrada ingrese nuevamente la opcion");
			}
		switch (opc) {
		case 1:
			System.out.println("------- Metodo de Gauss Jordan -------");
			
			break;
		case 2:
			System.out.println("------- Metodo de Biseccion -------");
			break;
		case 3:
			System.out.println("------- Metodo de la Secante -------");
			break;
		case 4:
			System.out.println("------- Metodo de la Secante -------");
			break;
		case 0:
			System.out.println("Gracias por usar nuestro sistema");
			break;
		default:
			System.out.println("Opcion incorrecta ingrese nuevamente");
			break;
		}
		System.out.println("");
			
			
		}
		
	}

}
