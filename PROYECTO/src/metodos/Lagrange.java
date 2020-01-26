package metodos;

public class Lagrange {


    private int[] y;
    private int[] x;
    private double[] a;

    public Lagrange(int[] y, int[] x) {
        this.x = x;
        this.y = y;
        a=new double[x.length];
    }

    private void polinomios() {

        double mult;

        for(int i=0;i<y.length;i++){
            mult = 1;

            for(int j=0;j<x.length;j++){

                if(i==j)continue;
                mult=(x[i]-x[j])*mult;
            }
            a[i]=y[i]/mult;
            //System.out.print("a"+"["+i+"]="+a[i]+"  ");


        }
    }

    public double evaluar(int punto){
        polinomios();

        int mult;
        double[] valores =new double[a.length];
        //System.out.println("");
        for(int i=0;i<a.length;i++){
            mult=1;
            for(int j=0;j<a.length;j++){

                if(i==j)continue;
                mult=(punto-x[j])*mult;

            }
            valores[i]=a[i]*mult;
            //System.out.print(valores[i]+" ");
            //if(i!=a.length-1)System.out.print(" + ");
        }

        double resultado=0;
        for(int k=0;k<valores.length;k++){

            resultado=resultado+valores[k];
        }

        return resultado;

    }

    public static void main(String[] args) {

        int[] x ={1,2,3,5};
        int[] y ={0,2,12,21};
        Lagrange l=new Lagrange(y, x);
        double res=l.evaluar(2);

        System.out.println("\nEl resultado es "+res);

    }
}
