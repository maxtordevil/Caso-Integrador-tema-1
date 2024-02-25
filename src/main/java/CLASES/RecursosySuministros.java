package CLASES_PUBLICAS;

public class RecursosySuministros {

    public double calcularConsumo(int multiplo) {
        // Asumiendo que el consumo diario es de 10 unidades
        return 10.0 * multiplo;
    }

    public double calcularMedia(double[] consumos) {
        double suma = 0.0;
        for (double consumo : consumos) {
            suma += consumo;
        }
        return suma / consumos.length;
    }

    public double calcularMinimo(double[] consumos) {
        double minimo = consumos[0];
        for (double consumo : consumos) {
            if (consumo < minimo) {
                minimo = consumo;
            }
        }
        return minimo;
    }

    public double calcularMaximo(double[] consumos) {
        double maximo = consumos[0];
        for (double consumo : consumos) {
            if (consumo > maximo) {
                maximo = consumo;
            }
        }
        return maximo;
    }
}