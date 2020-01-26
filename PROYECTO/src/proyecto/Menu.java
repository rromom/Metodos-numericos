package proyecto;

import java.util.*;

import metodos.Biseccion;
import metodos.GaussJordan;
import metodos.Lagrange;

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
			System.out.print(" Ingrese el numero de variables: ");
			int variables = teclado.nextInt();

			float[][] valores = new float[variables][variables+1];

			for (int i = 0; i < variables; i++) {
				System.out.println("\nIngrese los coeficientes de la ecuacion "+(i+1)+": ");
				for (int j = 0; j < valores[i].length; j++) {
					System.out.println("valor "+(j+1));
					valores[i][j] = teclado.nextFloat();
				}
			}

			GaussJordan.calcular(valores, variables);
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
			System.out.println("Ingrese la cantidad de puntos");
			int npuntos = teclado.nextInt();
			int x[] = new int[npuntos];
			int y[] = new int[npuntos];
			for (int j = 0; j < npuntos; j++) {
				System.out.println("ingrese el punto "+j+" para x: ");
				x[j] = teclado.nextInt();
				System.out.println("ingrese el punto "+j+" para y: ");
				y[j] = teclado.nextInt();

			}
			System.out.println("ingrese el valor a evaluar: ");
			int punto = teclado.nextInt();

			Lagrange pl = new Lagrange(y, x);
			double res = pl.evaluar(punto);
			System.out.println("El resultado es: "+res);

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
