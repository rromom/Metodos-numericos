package proyecto;

import java.util.*;

import metodos.Biseccion;

public class Menu {

	public static Scanner teclado;

	public static void main(String[] args) {

		teclado = new java.util.Scanner(System.in);
		teclado.useLocale(Locale.US);
		
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
			teclado.nextLine();
			System.out.println("------- Metodo de Biseccion -------");
			System.out.println("ingrese el valor inferior A");
			double a=teclado.nextDouble();
			System.out.println("ingrese el valor superior (B)");
			double b=teclado.nextDouble();
			System.out.println("ingrese la tolerncia");
			double t=teclado.nextDouble();
			System.out.println("ingrese el numero maximo de iteraciones");
			int i=teclado.nextInt();
			System.out.println("ingrese el grado de la ecuacion");
			int g=teclado.nextInt();
			System.out.println("ingrese los coeficientes en orden");
			double v[]=new double[g+1];
			for (int j = 0; j < v.length; j++) {
				v[j]=teclado.nextDouble();
			}
			Biseccion biseccion= new Biseccion(a, b, t, i);
			double sol=biseccion.calcularRaiz(g, v);
			System.out.println("la raiz es: "+sol);
			
			break;
		case 3:
			System.out.println("------- Metodo de la Secante -------");
			break;
		case 4:
			System.out.println("------- Metodo de Lagrange -------");
			break;
		case 0:
			System.out.println("Gracias por usar nuestro sistema");
			break;
		default:
			System.out.println("Opcion incorrecta ingrese nuevamente");
			break;
		}

		}

	}

}
