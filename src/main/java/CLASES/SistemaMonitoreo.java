package CLASES_PUBLICAS;

import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoreo {

    // Método para alertar a la tripulación sobre valores extremos y sugerir ajustes
    public String alerta(int radiacion, int temperatura, int presion) {
        StringBuilder mensaje = new StringBuilder();

        if (radiacion > 100) {
            mensaje.append("Nivel de radiación alto. Se recomienda tomar medidas de seguridad.\n");
        }

        if (temperatura > 40) {
            mensaje.append("Temperatura alta. Verificar el sistema de enfriamiento.\n");
        } else if (temperatura < 0) {
            mensaje.append("Temperatura baja. Verificar el sistema de calefacción.\n");
        }

        if (presion < 800) {
            mensaje.append("Presión baja. Verificar el sistema de sellado.\n");
        } else if (presion > 1200) {
            mensaje.append("Presión alta. Reducir la presión gradualmente.\n");
        }

        if (mensaje.length() == 0) {
            mensaje.append("Niveles normales. Todo en orden.\n");
        }

        return mensaje.toString();
    }

    // Método para identificar y listar los N primeros eventos raros o críticos (números primos como metáfora de rareza)
    public List<Integer> eventosRaros(int N) {
        List<Integer> eventos = new ArrayList<>();
        int numero = 2;
        while (eventos.size() < N) {
            if (esPrimo(numero)) {
                eventos.add(numero);
            }
            numero++;
        }
        return eventos;
    }

    // Función para verificar si un número es primo
    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

