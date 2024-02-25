package CLASES_PUBLICAS;

public class NavegadorEstelar {

    // Método para calcular y visualizar rutas de exploración
    public void calcularRutasExploracion(int[][] terreno) {
        System.out.println("Rutas de exploración:");
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno[i].length; j++) {
                if (terreno[i][j] == 1) {
                    System.out.println("Explorar terreno en la posición [" + i + "][" + j + "]");
                }
            }
        }
    }

    // Método para calcular y visualizar rutas de expansión de la base
    public void calcularRutasExpansion(int[][] terreno) {
        System.out.println("Rutas de expansión de la base:");
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno[i].length; j++) {
                if (terreno[i][j] == 2) {
                    System.out.println("Expandir base hacia la posición [" + i + "][" + j + "]");
                }
            }
        }
    }

    // Función para multiplicar matrices
    public int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;
        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }
}
