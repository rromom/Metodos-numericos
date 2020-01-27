package metodos;

public class Secante {

	double x[]=new double[50];
	double x0,x1;
	double r;
	double e=10;

	public Secante(double x0, double x1)
	{
	x[0]=x0;
	x[1]=x1;
	}
	
	double f(double x,int opc,double v[])
	{

	double y=0;
	switch (opc) {
	case 1:
		y=v[0]*x+v[1];
		break;
	case 2:
		y=v[0]*Math.pow(x, 2)+v[1]*x+v[2];
		break;
	case 3:
		y=v[0]*Math.pow(x, 3)+v[1]*Math.pow(x, 2)+v[2]*x+v[3];
		break;
	default:
		break;
	}
	return y;

	}
	
	
	public double calcRaiz(int opc,double v[],double tol)
	{
	//este método define el proceso para calcular la raiz
	int i=1;
	while(e>tol)
	{
	x[i+1]=x[i]-( (f(x[i],opc,v)*(x[i-1]-x[i]))/(f(x[i-1],opc,v)-f(x[i],opc,v)) );

	e=Math.abs((x[i+1]-x[i])/(x[i+1]))*100;
//	System.out.println(x[i+1]+” \t”+e+”\n”);
//	System.out.println(x[i+1]+"\t"+e+"\n");
	i++;

	}
	return x[i];

	}
	
}
