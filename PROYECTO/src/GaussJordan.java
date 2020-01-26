public class GaussJordan {

    static int var=4;
    static float[][] matrix = new float [var][var+1];

    public static void main(String[] args){

        float[][] m = {
                {3,2,5,8},{1,4,2,7},{-2,4,8,0}
        };
        jordan(m, 3);

    }

    //divide la fila para el pivote
    static void pivote(float[][] matriz, int piv, int var) {
        float temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {

            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }

    // hace todos los elementos 0 excepto el pivote
    static void hacerceros(float[][] matriz, int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                float c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }

    //mostrar la matrix en consola
    static void muestramatriz(float[][] matriz, int var) {
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
                System.out.printf(" %.2f |", matriz[x][y]);
            }
            System.out.println();
        }

    }

    // metodo de gauss jordan
    public static void jordan(float[][] matrix, int var){
        int piv=0;
        for (int a = 0; a < var; a++) {
            pivote(matrix, piv, var);

            System.out.println("\tRenglon " + (a + 1) + " entre el pivote");
            muestramatriz(matrix, var);

            System.out.println();

            System.out.println("\tHaciendo ceros");
            hacerceros(matrix, piv, var);

            muestramatriz(matrix, var);
            System.out.println();
            piv++;
        }
        for (int x = 0; x < var; x++) {

            String sal =  "X" + (x + 1) + " = " + matrix[x][var];
            System.out.println(sal);
        }

    }

}
