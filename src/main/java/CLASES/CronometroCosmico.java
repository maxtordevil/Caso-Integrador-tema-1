package CLASES_PUBLICAS;

public class CronometroCosmico {
    private static final double FACTOR_CONVERSION = 1.0;  // Este valor puede cambiar dependiendo del nuevo planeta

    public double convertirTiempo(double tiempoTerrestre) {
        return tiempoTerrestre * FACTOR_CONVERSION;
    }

    public String formatearTiempo(double tiempo) {
        return String.format("%.6f segundos", tiempo);
    }
}