package metodos;

public class Biseccion {
	double a,b,tol,p;
	double matriz[][];
    int k,j,ni;
    public Biseccion(double a1, double b1, double tol1,int ni1){
         a=a1;
         b=b1;
         tol=tol1;
         ni=ni1;
         this.matriz=new double[ni][5];
    }
    private double redondea(double n){
    	return Math.rint(n*1000000)/1000000;
    }
    private double f(double x,int opc){
    	double r;
    	switch(opc){
    	case 1:
    		r=Math.pow(x,3)+4*Math.pow(x,2)-10;
    		return r;
    	case 2:
    		r=Math.pow(x,3)-x-1;
    		return r;
    	case 3:
    		r=Math.pow(x,3)-7*Math.pow(x,2)+14*x-6;
    		return r;
    	default:
    		break;
    	}
    	return 0;	
    }
    public double calcularRaiz(){
    	int i=0;
    	double p,q;
        q=((b-a)/2);
        p=(a+q);
        while(i<ni){
            matriz[i][0]= i;
            matriz[i][1]=a;
            matriz[i][2]=b;
            matriz[i][3]=p;
            matriz[i][4]=f(p,3);
        	//if(f(p,3)==0||q<tol){
        	    if(Math.abs(f(p,3))<tol){
        		System.out.println("Proceso completado satisfactoriamente con "+f(p,3));
        		break;
        	}	
        	else{
        		if(f(a,3)*f(p,3)>0)
        			a=p;
        		else
        			b=p;
        		q=redondea((b-a)/2);
        		p=redondea(a+q);
        	}
        	i++;
        }
 
       return p;
    }
   
    public double[][] getMatriz() {return matriz;}
    
   
    
    /*
    public static void main(String[] args) {
        Biseccion b=new Biseccion(0,1,0.01,20);
        double raiz=b.calcularRaiz();
        System.out.println("La raíz es: "+raiz);
        System.out.println("\n\n Matriz: \n");
        for(double[] array : b.getMatriz()){
            for(double numero:array)
                System.out.print(numero+"\t");
            System.out.println();
        }

    }
    */

    
}
